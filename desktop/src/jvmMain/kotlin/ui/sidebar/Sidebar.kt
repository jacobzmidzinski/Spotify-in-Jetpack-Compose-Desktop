package ui.sidebar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.twotone.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import theme.Colors

@Composable
fun Sidebar(modifier: Modifier) {
    val width by remember { mutableStateOf(180.dp) }
    Column(
        modifier = modifier
            .background(Colors.Surface)
            .preferredWidth(width)
            .widthIn(120.dp, 400.dp),
        verticalArrangement = Arrangement.spacedBy(48.dp)
    ) {
        SidebarMenu(width)
        SidebarLibrary(width)
        SidebarPlaylists(width)
        SidebarNewPlaylist(width)
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
        Text(
            text = "Your Library".toUpperCase(),
            color = Colors.Text
        )
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
        Text(
            text = "Playlists".toUpperCase(),
            color = Colors.Text,
            fontWeight = FontWeight.Light
        )
        MenuItem("Your Top Songs 2020", width)
    }
}

@Composable
fun SidebarNewPlaylist(width: Dp) {
    Column(
        verticalArrangement = Arrangement.Bottom,
    ) {
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .height(1.dp)
                .width(width)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .width(width)
                .padding(16.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.AddCircle,
                tint = Colors.Text
            )
            Text(
                text = "New Playlist",
                color = Colors.Text,
                fontWeight = FontWeight.Light
            )
        }
    }
}

