package ui.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MainSection(modifier: Modifier) {
    Box(
        modifier = modifier
            .background(Color.Red)
            .fillMaxSize()
    )
}