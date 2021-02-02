package ui.bottombar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.theme.Colors

@Composable
fun BottomBar(modifier: Modifier) {
    Box(
        modifier = modifier
            .background(Colors.SurfaceLight)
            .fillMaxWidth()
            .height(86.dp)
    )
}