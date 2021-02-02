package ui.friendsactivity

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FriendsActivity(modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(48.dp, alignment = Alignment.CenterVertically),
        modifier = modifier
            .padding(32.dp)
            .width(180.dp)
        // TODO: In the future, size should be adjustable in this range
        //.widthIn(180.dp, 400.dp)
    ) {
        Text(
            text = "See what your friends are playing",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        FindFriendsButton()
    }
}