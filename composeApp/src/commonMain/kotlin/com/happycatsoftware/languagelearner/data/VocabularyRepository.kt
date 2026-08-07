package com.happycatsoftware.languagelearner.data

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class VocabularyRepository(private val dataStore: DataStore<Preferences>) {
    private val key = stringPreferencesKey("vocabulary_sets")

    val vocabularySets: Flow<List<VocabularySet>> = dataStore.data.map { preferences ->
        val json = preferences[key] ?: "[]"
        try {
            Json.decodeFromString<List<VocabularySet>>(json)
        } catch (e: Exception) {
            emptyList()
        }
    }

    suspend fun saveVocabularySets(sets: List<VocabularySet>) {
        dataStore.edit { preferences ->
            preferences[key] = Json.encodeToString(sets)
        }
    }
}
