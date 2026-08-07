package com.happycatsoftware.languagelearner

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.happycatsoftware.languagelearner.data.DATA_STORE_FILE_NAME
import com.happycatsoftware.languagelearner.data.RepositoryProvider
import com.happycatsoftware.languagelearner.data.VocabularyRepository
import com.happycatsoftware.languagelearner.data.createDataStore
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val dataStore = createDataStore { DATA_STORE_FILE_NAME }
    RepositoryProvider.repository = VocabularyRepository(dataStore)

    ComposeViewport(document.body!!) {
        App()
    }
}
