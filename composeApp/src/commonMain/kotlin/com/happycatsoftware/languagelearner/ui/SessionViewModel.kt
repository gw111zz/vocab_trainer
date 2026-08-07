package com.happycatsoftware.languagelearner.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.happycatsoftware.languagelearner.data.RepositoryProvider
import com.happycatsoftware.languagelearner.data.VocabularySet
import com.happycatsoftware.languagelearner.data.VocabularyWord
import com.happycatsoftware.languagelearner.navigation.SessionDirection
import com.happycatsoftware.languagelearner.navigation.SessionMode
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

data class SessionState(
    val currentSet: VocabularySet? = null,
    val currentIndex: Int = 0,
    val isFinished: Boolean = false,
    val score: Int = 0,
    val userInput: String = "",
    val feedbackMessage: String? = null,
    val isCorrect: Boolean? = null,
    val canMoveToNext: Boolean = false
)

class SessionViewModel(
    private val setId: String,
    private val mode: SessionMode,
    private val direction: SessionDirection
) : ViewModel() {
    private val repository = RepositoryProvider.repository
    private val _state = MutableStateFlow(SessionState())
    val state: StateFlow<SessionState> = _state.asStateFlow()

    init {
        loadSet()
    }

    private fun loadSet() {
        viewModelScope.launch {
            val allSets = repository.vocabularySets.first()
            val set = allSets.find { it.id == setId }
            _state.value = _state.value.copy(
                currentSet = set,
                isFinished = set?.words?.isEmpty() == true
            )
        }
    }

    fun onUserInputChanged(input: String) {
        if (_state.value.canMoveToNext) return
        _state.value = _state.value.copy(userInput = input)
    }

    fun checkAnswer() {
        val currentState = _state.value
        val currentSet = currentState.currentSet ?: return
        val currentWord = currentSet.words.getOrNull(currentState.currentIndex) ?: return

        val (expected, prompt) = if (direction == SessionDirection.ItalianToEnglish) {
            currentWord.translation to currentWord.original
        } else {
            currentWord.original to currentWord.translation
        }

        val isCorrect = compareAnswers(currentState.userInput, expected)

        if (mode == SessionMode.SpacedRepetition) {
            updateSpacedRepetition(currentWord, isCorrect)
        } else {
            if (isCorrect) {
                _state.value = _state.value.copy(score = currentState.score + 1)
            }
        }

        _state.value = _state.value.copy(
            isCorrect = isCorrect,
            feedbackMessage = if (isCorrect) "Correct!" else "Incorrect. Expected: $expected",
            canMoveToNext = true
        )
    }

    private fun compareAnswers(user: String, correct: String): Boolean {
        // Special handling for "Hello/Goodbye" style answers if original contains /
        // Actually, the user requirement is "ignore whitespace and capitalisation but compare accented characters precisely"
        val normalizedUser = user.trim().lowercase().replace(Regex("\\s+"), " ")
        
        // Handle multiple possible answers separated by / or ,
        val possibleAnswers = correct.split('/', ',').map { it.trim().lowercase().replace(Regex("\\s+"), " ") }
        
        return normalizedUser in possibleAnswers
    }

    fun nextWord() {
        val currentState = _state.value
        val currentSet = currentState.currentSet ?: return
        
        if (currentState.currentIndex + 1 < currentSet.words.size) {
            _state.value = _state.value.copy(
                currentIndex = currentState.currentIndex + 1,
                userInput = "",
                feedbackMessage = null,
                isCorrect = null,
                canMoveToNext = false
            )
        } else {
            _state.value = _state.value.copy(isFinished = true)
        }
    }

    private fun updateSpacedRepetition(word: VocabularyWord, isCorrect: Boolean) {
        viewModelScope.launch {
            val newProficiency = if (isCorrect) {
                (word.proficiency + 1).coerceAtMost(5)
            } else {
                (word.proficiency - 1).coerceAtLeast(0)
            }

            val updatedWord = word.copy(
                proficiency = newProficiency,
                lastReviewed = 0L // Placeholder
            )

            updateWordInRepository(updatedWord)
        }
    }

    private suspend fun updateWordInRepository(updatedWord: VocabularyWord) {
        val allSets = repository.vocabularySets.first()
        val updatedSets = allSets.map { set ->
            if (set.id == setId) {
                set.copy(words = set.words.map { word ->
                    if (word.original == updatedWord.original) updatedWord else word
                })
            } else {
                set
            }
        }
        repository.saveVocabularySets(updatedSets)
    }
}
