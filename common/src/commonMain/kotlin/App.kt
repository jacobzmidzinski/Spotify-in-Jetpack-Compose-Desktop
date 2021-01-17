import androidx.compose.foundation.Image
import androidx.compose.material.*
import androidx.compose.runtime.*

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Button(onClick = {
            text = "Hello, ${getPlatformName()}"
        }) {
            Text(text)
        }
    }
}

expect fun getPlatformName(): String