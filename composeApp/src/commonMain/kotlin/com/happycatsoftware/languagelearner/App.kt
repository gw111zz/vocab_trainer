package com.happycatsoftware.languagelearner

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.navigation3.rememberListDetailSceneStrategy
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration
import com.happycatsoftware.languagelearner.navigation.*
import com.happycatsoftware.languagelearner.ui.screens.CategoryWordListScreen
import com.happycatsoftware.languagelearner.ui.screens.FlashCardsScreen
import com.happycatsoftware.languagelearner.ui.screens.ModeSelectionScreen
import com.happycatsoftware.languagelearner.ui.screens.SessionScreen
import com.happycatsoftware.languagelearner.ui.screens.VocabularyListScreen
import com.happycatsoftware.languagelearner.ui.theme.LanguageLearnerTheme
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

private val navConfig = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            subclass(VocabularyList::class, VocabularyList.serializer())
            subclass(ModeSelection::class, ModeSelection.serializer())
            subclass(Session::class, Session.serializer())
            subclass(CategoryWordList::class, CategoryWordList.serializer())
        }
    }
}

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun App() {
    LanguageLearnerTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val backStack = rememberNavBackStack(
                navConfig,
                VocabularyList
            )

            NavDisplay<NavKey>(
                backStack = backStack,
                onBack = { backStack.removeLastOrNull() },
                sceneStrategies = listOf(rememberListDetailSceneStrategy()),
                entryProvider = entryProvider {
                    entry<VocabularyList> {
                        VocabularyListScreen(
                            onSetSelected = { setId ->
                                backStack.add(ModeSelection(setId))
                            }
                        )
                    }
                    entry<ModeSelection> { key ->
                        ModeSelectionScreen(
                            setId = key.setId,
                            onModeSelected = { mode, direction ->
                                backStack.add(Session(key.setId, mode, direction))
                            },
                            onWordListSelected = {
                                backStack.add(CategoryWordList(key.setId))
                            },
                            onBack = { backStack.removeLast() }
                        )
                    }
                    entry<Session> { key ->
                        if (key.mode == SessionMode.FlashCards) {
                            FlashCardsScreen(
                                setId = key.setId,
                                direction = key.direction,
                                onClose = { backStack.removeLast() }
                            )
                        } else {
                            SessionScreen(
                                setId = key.setId,
                                mode = key.mode,
                                direction = key.direction,
                                onClose = { backStack.removeLast() }
                            )
                        }
                    }
                    entry<CategoryWordList> { key ->
                        CategoryWordListScreen(
                            setId = key.setId,
                            onBack = { backStack.removeLast() }
                        )
                    }
                }
            )
        }
    }
}
