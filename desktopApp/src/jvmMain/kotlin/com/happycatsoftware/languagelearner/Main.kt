package com.happycatsoftware.languagelearner

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.happycatsoftware.languagelearner.data.DATA_STORE_FILE_NAME
import com.happycatsoftware.languagelearner.data.RepositoryProvider
import com.happycatsoftware.languagelearner.data.VocabularyRepository
import com.happycatsoftware.languagelearner.data.createDataStore

fun main() = application {
    val dataStore = createDataStore { DATA_STORE_FILE_NAME }
    RepositoryProvider.repository = VocabularyRepository(dataStore)

    Window(onCloseRequest = ::exitApplication, title = "Language Learner") {
        App()
    }
}
