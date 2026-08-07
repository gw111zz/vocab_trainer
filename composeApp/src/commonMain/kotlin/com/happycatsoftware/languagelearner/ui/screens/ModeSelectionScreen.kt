package com.happycatsoftware.languagelearner.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.happycatsoftware.languagelearner.navigation.SessionDirection
import com.happycatsoftware.languagelearner.navigation.SessionMode

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModeSelectionScreen(
    setId: String,
    onModeSelected: (SessionMode, SessionDirection) -> Unit,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Select Mode") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Spaced Repetition",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Button(
                    onClick = { onModeSelected(SessionMode.SpacedRepetition, SessionDirection.ItalianToEnglish) },
                    modifier = Modifier.weight(1f).height(64.dp)
                ) {
                    Text("IT -> EN")
                }
                Button(
                    onClick = { onModeSelected(SessionMode.SpacedRepetition, SessionDirection.EnglishToItalian) },
                    modifier = Modifier.weight(1f).height(64.dp)
                ) {
                    Text("EN -> IT")
                }
            }

            Spacer(Modifier.height(32.dp))

            Text(
                "Testing Mode",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                OutlinedButton(
                    onClick = { onModeSelected(SessionMode.Testing, SessionDirection.ItalianToEnglish) },
                    modifier = Modifier.weight(1f).height(64.dp)
                ) {
                    Text("IT -> EN")
                }
                OutlinedButton(
                    onClick = { onModeSelected(SessionMode.Testing, SessionDirection.EnglishToItalian) },
                    modifier = Modifier.weight(1f).height(64.dp)
                ) {
                    Text("EN -> IT")
                }
            }
        }
    }
}
