import androidx.compose.animation.expandVertically
import androidx.compose.desktop.Window
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import theme.Colors
import ui.bottombar.BottomBar
import ui.friendsactivity.FriendsActivity
import ui.sidebar.Sidebar

fun main() = Window(
    title = "Jetify Compose"
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .background(Colors.Surface)
                .weight(1f, true)
        ) {
            Sidebar(modifier = Modifier)
            Box(
                modifier = Modifier
                    .background(Color.Red)
                    .weight(1f, true)
                    .fillMaxSize()
            )
            FriendsActivity(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            )
        }
        BottomBar(modifier = Modifier)
    }
}