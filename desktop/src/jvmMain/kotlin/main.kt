import androidx.compose.desktop.Window
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import theme.Colors
import ui.friendsactivity.FriendsActivity
import ui.sidebar.Sidebar

fun main() = Window(
    title = "Jetify Compose"
) {
    Row(
        modifier = Modifier
            .background(Colors.Surface)
    ) {
        Sidebar()
        Box(
            modifier = Modifier
                .background(Color.Red)
                .weight(3f, true)
                .fillMaxSize()
        )
        FriendsActivity()
    }
}