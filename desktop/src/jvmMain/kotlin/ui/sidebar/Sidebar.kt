package ui.sidebar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import theme.Colors

@Composable
fun Sidebar() {
    var width by remember { mutableStateOf(180.dp) }
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(Colors.Surface)
            .preferredWidth(width)
            .widthIn(120.dp, 400.dp)
    ) {
        MenuItem("Home", "home.png", width)
        Spacer(Modifier.height(14.dp))
        MenuItem("Browse", "browse.png", width)
        Spacer(Modifier.height(14.dp))
        MenuItem("Radio", "radio.png", width)
    }
}