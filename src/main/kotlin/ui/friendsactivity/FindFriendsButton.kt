package ui.friendsactivity

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

