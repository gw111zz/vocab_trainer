package com.happycatsoftware.languagelearner.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
enum class SessionMode {
    SpacedRepetition,
    Testing
}

@Serializable
enum class SessionDirection {
    ItalianToEnglish,
    EnglishToItalian
}

@Serializable
sealed class RootRoute : NavKey

@Serializable
data object VocabularyList : RootRoute()

@Serializable
data class ModeSelection(val setId: String) : RootRoute()

@Serializable
data class Session(
    val setId: String, 
    val mode: SessionMode,
    val direction: SessionDirection
) : RootRoute()
