package ui.sidebar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import theme.Colors

@Composable
fun Sidebar() {
    val width by remember { mutableStateOf(180.dp) }
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(Colors.Surface)
            .preferredWidth(width)
            .widthIn(120.dp, 400.dp),
        verticalArrangement = Arrangement.spacedBy(48.dp)
    ) {
        SidebarMenu(width)
        SidebarLibrary(width)
        SidebarPlaylists(width)
    }
}

@Composable
fun SidebarMenu(width: Dp) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(Colors.Surface)
            .preferredWidth(width)
            .widthIn(120.dp, 400.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        MenuItem("Home", width, "home.png")
        MenuItem("Browse", width, "browse.png")
        MenuItem("Radio", width, "radio.png")
    }
}

@Composable
fun SidebarLibrary(width: Dp) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(Colors.Surface)
            .preferredWidth(width)
            .widthIn(120.dp, 400.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Text("Your Library".toUpperCase())
        MenuItem("Made For Your", width)
    }
}

@Composable
fun SidebarPlaylists(width: Dp) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(Colors.Surface)
            .preferredWidth(width)
            .widthIn(120.dp, 400.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        Text("Playlists".toUpperCase())
        MenuItem("Your Top Songs 2020", width)
    }
}

