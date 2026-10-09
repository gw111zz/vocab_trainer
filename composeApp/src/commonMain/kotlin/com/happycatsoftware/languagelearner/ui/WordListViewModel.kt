package com.happycatsoftware.languagelearner.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.happycatsoftware.languagelearner.data.RepositoryProvider
import com.happycatsoftware.languagelearner.data.VocabularySet
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class WordListViewModel(private val setId: String) : ViewModel() {
    private val repository = RepositoryProvider.repository

    val vocabularySet: StateFlow<VocabularySet?> = repository.vocabularySets
        .map { sets -> sets.find { it.id == setId } }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = null
        )
}
