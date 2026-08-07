package com.happycatsoftware.languagelearner.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
actual fun LanguageLearnerTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = getColorScheme(darkTheme),
        typography = Typography,
        content = content
    )
}
