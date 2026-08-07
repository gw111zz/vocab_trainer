package com.happycatsoftware.languagelearner.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.*
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.happycatsoftware.languagelearner.navigation.SessionDirection
import com.happycatsoftware.languagelearner.navigation.SessionMode
import com.happycatsoftware.languagelearner.ui.SessionViewModel
import kotlinx.datetime.Clock

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SessionScreen(
    setId: String,
    mode: SessionMode,
    direction: SessionDirection,
    onClose: () -> Unit
) {
    val viewModel: SessionViewModel = viewModel(key = "$setId-$mode-$direction") {
        SessionViewModel(setId, mode, direction) 
    }
    val state by viewModel.state.collectAsState()
    val focusRequester = remember { FocusRequester() }

    // Auto-focus the text field when a new word is presented
    LaunchedEffect(state.currentIndex, state.isFinished) {
        if (!state.isFinished) {
            focusRequester.requestFocus()
        }
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(if (mode == SessionMode.SpacedRepetition) "Learning" else "Testing") },
                navigationIcon = {
                    IconButton(onClick = onClose) {
                        Icon(Icons.Default.Close, contentDescription = "Close")
                    }
                }
            )
        }
    ) { padding ->
        if (state.isFinished) {
            Box(Modifier.fillMaxSize().padding(padding), contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("Session Finished!", style = MaterialTheme.typography.headlineLarge)
                    if (mode == SessionMode.Testing) {
                        Text("Score: ${state.score} / ${state.currentSet?.words?.size}", style = MaterialTheme.typography.bodyLarge)
                    }
                    Spacer(Modifier.height(16.dp))
                    Button(onClick = onClose) {
                        Text("Back to Menu")
                    }
                }
            }
        } else {
            val currentWord = state.currentSet?.words?.getOrNull(state.currentIndex)
            if (currentWord != null) {
                val prompt = if (direction == SessionDirection.ItalianToEnglish) {
                    currentWord.original
                } else {
                    currentWord.translation
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer
                        )
                    ) {
                        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            Text(
                                prompt,
                                style = MaterialTheme.typography.displayMedium,
                                color = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                        }
                    }

                    Spacer(Modifier.height(32.dp))

                    OutlinedTextField(
                        value = state.userInput,
                        onValueChange = { viewModel.onUserInputChanged(it) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .focusRequester(focusRequester)
                            .onKeyEvent { keyEvent ->
                                if (keyEvent.type == KeyEventType.KeyDown && 
                                    (keyEvent.key == Key.Enter || keyEvent.key == Key.NumPadEnter)) {
                                    if (state.canMoveToNext) {
                                        viewModel.nextWord()
                                        true
                                    } else if (state.userInput.isNotBlank()) {
                                        viewModel.checkAnswer()
                                        true
                                    } else {
                                        false
                                    }
                                } else {
                                    false
                                }
                            },
                        label = { Text("Translation") },
                        isError = state.isCorrect == false,
                        readOnly = state.canMoveToNext,
                        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                        keyboardActions = KeyboardActions(
                            onDone = {
                                if (state.canMoveToNext) {
                                    viewModel.nextWord()
                                } else if (state.userInput.isNotBlank()) {
                                    viewModel.checkAnswer()
                                }
                            }
                        ),
                        singleLine = true
                    )

                    state.feedbackMessage?.let { message ->
                        Spacer(Modifier.height(16.dp))
                        Text(
                            text = message,
                            color = if (state.isCorrect == true) Color(0xFF4CAF50) else MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }

                    Spacer(Modifier.weight(1f))

                    Button(
                        onClick = {
                            if (state.canMoveToNext) {
                                viewModel.nextWord()
                            } else {
                                viewModel.checkAnswer()
                            }
                        },
                        modifier = Modifier.fillMaxWidth().height(56.dp),
                        enabled = state.userInput.isNotBlank() || state.canMoveToNext
                    ) {
                        Text(if (state.canMoveToNext) "Next" else "Check")
                    }
                }
            }
        }
    }
}
