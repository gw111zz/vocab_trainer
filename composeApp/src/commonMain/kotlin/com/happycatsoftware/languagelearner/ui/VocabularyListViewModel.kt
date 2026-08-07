package com.happycatsoftware.languagelearner.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.happycatsoftware.languagelearner.data.RepositoryProvider
import com.happycatsoftware.languagelearner.data.VocabularySet
import com.happycatsoftware.languagelearner.data.VocabularyWord
import com.happycatsoftware.languagelearner.data.initialItalianSets
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class VocabularyListViewModel : ViewModel() {
    private val repository = RepositoryProvider.repository

    val vocabularySets: StateFlow<List<VocabularySet>> = repository.vocabularySets
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    fun addSampleSet() {
        viewModelScope.launch {
            val currentSets = vocabularySets.value
            val newSet = VocabularySet(
                id = (currentSets.size + 1).toString(),
                name = "My Custom Set ${currentSets.size + 1}",
                words = listOf(VocabularyWord("Hello", "Ciao"))
            )
            repository.saveVocabularySets(currentSets + newSet)
        }
    }
    
    fun ensureSampleData() {
        viewModelScope.launch {
            val currentSets = vocabularySets.value
            val filteredSets = currentSets.filterNot { it.name.startsWith("New Set") }
            
            if (filteredSets.isEmpty()) {
                repository.saveVocabularySets(initialItalianSets)
            } else if (filteredSets.size != currentSets.size) {
                repository.saveVocabularySets(filteredSets)
            }
        }
    }
}
