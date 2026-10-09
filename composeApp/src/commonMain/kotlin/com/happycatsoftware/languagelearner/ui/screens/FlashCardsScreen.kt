package com.happycatsoftware.languagelearner.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.happycatsoftware.languagelearner.navigation.SessionDirection
import com.happycatsoftware.languagelearner.ui.FlashCardsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FlashCardsScreen(
    setId: String,
    direction: SessionDirection,
    onClose: () -> Unit
) {
    val viewModel: FlashCardsViewModel = viewModel(key = "$setId-$direction-flashcards") {
        FlashCardsViewModel(setId, direction)
    }
    val state by viewModel.state.collectAsState()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Flash Cards") },
                navigationIcon = {
                    IconButton(onClick = onClose) {
                        Icon(Icons.Default.Close, contentDescription = "Close")
                    }
                }
            )
        }
    ) { padding ->
        if (state.isFinished) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Flash Cards Completed!", style = MaterialTheme.typography.headlineLarge)
                    Spacer(Modifier.height(24.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(onClick = { viewModel.restartSession() }) {
                            Text("Start Again")
                        }
                        OutlinedButton(onClick = onClose) {
                            Text("Back to Menu")
                        }
                    }
                }
            }
        } else {
            val currentSet = state.currentSet
            val currentWord = currentSet?.words?.getOrNull(state.currentIndex)

            if (currentWord != null) {
                val frontText = if (direction == SessionDirection.ItalianToEnglish) {
                    currentWord.original
                } else {
                    currentWord.translation
                }

                val backText = if (direction == SessionDirection.ItalianToEnglish) {
                    currentWord.translation
                } else {
                    currentWord.original
                }

                val rotation by animateFloatAsState(
                    targetValue = if (state.isFlipped) 180f else 0f,
                    animationSpec = tween(durationMillis = 400)
                )

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Card ${state.currentIndex + 1} of ${currentSet.words.size}",
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Spacer(Modifier.height(16.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .graphicsLayer {
                                rotationY = rotation
                                cameraDistance = 12f * density
                            }
                            .clickable { viewModel.flipCard() },
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer
                        )
                    ) {
                        val isBackSide = rotation > 90f
                        Box(
                            modifier = Modifier.fillMaxSize().padding(16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.graphicsLayer {
                                    if (isBackSide) rotationY = 180f
                                }
                            ) {
                                Text(
                                    text = if (!isBackSide) frontText else backText,
                                    style = MaterialTheme.typography.displayMedium,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                                Spacer(Modifier.height(16.dp))
                                Text(
                                    text = "Tap card to flip",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f)
                                )
                            }
                        }
                    }

                    Spacer(Modifier.height(24.dp))

                    Button(
                        onClick = { viewModel.nextCard() },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp)
                    ) {
                        Text("Next")
                    }
                }
            }
        }
    }
}
