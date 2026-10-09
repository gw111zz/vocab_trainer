package com.happycatsoftware.languagelearner.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.happycatsoftware.languagelearner.data.RepositoryProvider
import com.happycatsoftware.languagelearner.data.VocabularySet
import com.happycatsoftware.languagelearner.navigation.SessionDirection
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

data class FlashCardsState(
    val currentSet: VocabularySet? = null,
    val currentIndex: Int = 0,
    val isFlipped: Boolean = false,
    val isFinished: Boolean = false
)

class FlashCardsViewModel(
    private val setId: String,
    val direction: SessionDirection
) : ViewModel() {
    private val repository = RepositoryProvider.repository
    private val _state = MutableStateFlow(FlashCardsState())
    val state: StateFlow<FlashCardsState> = _state.asStateFlow()

    init {
        loadSet()
    }

    private fun loadSet() {
        viewModelScope.launch {
            val allSets = repository.vocabularySets.first()
            val set = allSets.find { it.id == setId }
            val randomizedSet = set?.copy(words = set.words.shuffled())
            _state.value = _state.value.copy(
                currentSet = randomizedSet,
                isFinished = randomizedSet?.words.isNullOrEmpty()
            )
        }
    }

    fun flipCard() {
        _state.value = _state.value.copy(isFlipped = !_state.value.isFlipped)
    }

    fun nextCard() {
        val currentState = _state.value
        val currentSet = currentState.currentSet ?: return

        if (currentState.currentIndex + 1 < currentSet.words.size) {
            _state.value = _state.value.copy(
                currentIndex = currentState.currentIndex + 1,
                isFlipped = false
            )
        } else {
            _state.value = _state.value.copy(isFinished = true)
        }
    }

    fun restartSession() {
        viewModelScope.launch {
            val allSets = repository.vocabularySets.first()
            val set = allSets.find { it.id == setId }
            val randomizedSet = set?.copy(words = set.words.shuffled())
            _state.value = FlashCardsState(
                currentSet = randomizedSet,
                currentIndex = 0,
                isFlipped = false,
                isFinished = randomizedSet?.words.isNullOrEmpty()
            )
        }
    }
}
