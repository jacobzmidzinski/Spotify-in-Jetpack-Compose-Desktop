package ui.sidebar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import theme.Colors

@Composable
fun Sidebar() {
    Column(
        modifier = Modifier
            .background(Colors.Surface)
            .preferredWidth(240.dp)
    ) {
        MenuItem("Home", "home.png")
        Spacer(Modifier.height(14.dp))
        MenuItem("Browse", "browse.png")
        Spacer(Modifier.height(14.dp))
        MenuItem("Radio", "radio.png")
    }
}