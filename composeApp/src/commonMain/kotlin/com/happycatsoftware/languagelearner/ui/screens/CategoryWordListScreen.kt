package com.happycatsoftware.languagelearner.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.happycatsoftware.languagelearner.ui.WordListViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryWordListScreen(
    setId: String,
    onBack: () -> Unit
) {
    val viewModel: WordListViewModel = viewModel(key = setId) {
        WordListViewModel(setId)
    }
    val vocabularySet by viewModel.vocabularySet.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(vocabularySet?.name ?: "Word List") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        val set = vocabularySet
        if (set == null || set.words.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = if (set == null) "Category not found" else "No words in this category",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = padding
            ) {
                items(set.words) { word ->
                    ListItem(
                        headlineContent = {
                            Text(
                                text = word.original,
                                style = MaterialTheme.typography.titleMedium
                            )
                        },
                        supportingContent = {
                            Text(
                                text = word.translation,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    )
                    HorizontalDivider()
                }
            }
        }
    }
}
