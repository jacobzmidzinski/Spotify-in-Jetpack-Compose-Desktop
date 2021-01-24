package ui.bottombar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar(modifier: Modifier) {
    Box(
        modifier = modifier
            .background(Color.Green)
            .fillMaxWidth()
            .height(86.dp)
    )
}