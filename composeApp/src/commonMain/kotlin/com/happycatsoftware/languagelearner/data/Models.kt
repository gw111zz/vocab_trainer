package com.happycatsoftware.languagelearner.data

import kotlinx.serialization.Serializable

@Serializable
data class VocabularyWord(
    val original: String,
    val translation: String,
    val proficiency: Int = 0,
    val lastReviewed: Long = 0
)

@Serializable
data class VocabularySet(
    val id: String,
    val name: String,
    val words: List<VocabularyWord> = emptyList()
)
