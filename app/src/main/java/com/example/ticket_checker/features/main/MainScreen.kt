import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ui.theme.MyAppTheme

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Главный экран")
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MyAppTheme {
        MainScreen()
    }
}