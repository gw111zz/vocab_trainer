package com.happycatsoftware.languagelearner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.happycatsoftware.languagelearner.App
import com.happycatsoftware.languagelearner.data.DATA_STORE_FILE_NAME
import com.happycatsoftware.languagelearner.data.RepositoryProvider
import com.happycatsoftware.languagelearner.data.VocabularyRepository
import com.happycatsoftware.languagelearner.data.createDataStore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val dataStore = createDataStore { applicationContext.filesDir.resolve(DATA_STORE_FILE_NAME).absolutePath }
        RepositoryProvider.repository = VocabularyRepository(dataStore)

        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}
