package ui.friendsactivity

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FindFriendsButton() {
    Button(
        onClick = {},
        modifier = Modifier
            .background(Color.Transparent),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.White
        ),
        border = BorderStroke(1.dp, Color.White),
        shape = RoundedCornerShape(50)
    ) {
        Text(
            text = "Find Friends".toUpperCase(),
            fontSize = 10.sp,
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .background(Color.Transparent)
        )
    }
}

