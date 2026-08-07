package com.happycatsoftware.languagelearner.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.happycatsoftware.languagelearner.data.VocabularySet
import com.happycatsoftware.languagelearner.data.VocabularyWord
import com.happycatsoftware.languagelearner.ui.VocabularyListViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VocabularyListScreen(
    onSetSelected: (String) -> Unit
) {
    val viewModel: VocabularyListViewModel = viewModel { VocabularyListViewModel() }
    val vocabularySets by viewModel.vocabularySets.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.ensureSampleData()
    }

    Scaffold(
        topBar = {
            LargeTopAppBar(
                title = { Text("Vocabulary Lists") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                viewModel.addSampleSet()
            }) {
                Icon(Icons.Default.Add, contentDescription = "Add Set")
            }
        }
    ) { padding ->
        if (vocabularySets.isEmpty()) {
            Box(Modifier.fillMaxSize().padding(padding), contentAlignment = androidx.compose.ui.Alignment.Center) {
                Text("No vocabulary sets yet. Add one!", style = MaterialTheme.typography.bodyLarge)
            }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = padding
            ) {
                items(vocabularySets) { set ->
                    ListItem(
                        headlineContent = { Text(set.name) },
                        supportingContent = { Text("${set.words.size} words") },
                        modifier = Modifier.clickable { onSetSelected(set.id) }
                    )
                    HorizontalDivider()
                }
            }
        }
    }
}
