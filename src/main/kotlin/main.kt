import androidx.compose.desktop.Window
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.theme.Colors
import ui.bottombar.BottomBar
import ui.content.MainSection
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
            MainSection(
                modifier = Modifier
                    .weight(1f, true)
            )
            FriendsActivity(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            )
        }
        BottomBar(modifier = Modifier)
    }
}