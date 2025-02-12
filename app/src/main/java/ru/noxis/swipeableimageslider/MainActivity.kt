package ru.noxis.swipeableimageslider

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.noxis.swipeableimageslider.ui.theme.SwipeableImageSliderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SwipeableImageSliderTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val sliderList = remember {
                        mutableListOf(
                            "https://www.gstatic.com/webp/gallery/1.webp",
                            "https://www.gstatic.com/webp/gallery/2.webp",
                            "https://www.gstatic.com/webp/gallery/3.webp",
                            "https://www.gstatic.com/webp/gallery/4.webp",
                            "https://www.gstatic.com/webp/gallery/5.webp",
                        )
                    }
                    CustomSlider(
                        modifier = Modifier.padding(innerPadding),
                        sliderList = sliderList
                    )
                }
            }
        }
    }
}
