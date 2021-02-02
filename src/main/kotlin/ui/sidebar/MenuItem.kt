package ui.sidebar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ui.theme.Colors

@Composable
fun MenuItem(text: String, width: Dp, image: String? = null, isSelected: Boolean = false) {
    var selectedState: Boolean by remember { mutableStateOf(isSelected) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .preferredSize(width, 26.dp)
            .background(Colors.Surface)
            .clickable {
                selectedState = !selectedState
            }
    ) {
        SelectionIndicator(isSelected = selectedState)
        if (!image.isNullOrEmpty()) {
            Image(
                imageFromResource(image),
                Modifier
                    .preferredSize(36.dp)
            )
        }
        Spacer(
            Modifier
                .width(12.dp)
        )
        Text(
            text = text,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun SelectionIndicator(isSelected: Boolean) {
    if (isSelected) {
        Box(
            Modifier
                .width(4.dp)
                .fillMaxHeight()
                .background(Color(101, 210, 109))
        )
    }
    Spacer(
        Modifier
            .width(if (isSelected) 12.dp else 16.dp)
    )
}
