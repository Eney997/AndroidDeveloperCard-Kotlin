package com.example.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Box(modifier = Modifier.fillMaxSize().background(Color.Black.copy(alpha = 0.8f)),
                contentAlignment = Alignment.Center)
            {
                MyCustomCard(
                    modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                    R.drawable.android,
                    title = "Shadows & Lightnings",
                    text = "Create suitable and stoning Ui designs with this tips using Jetpack Compose,The new Ui Toolkit for building Ui in Android.",
                    publisher = Publisher(
                        name = "John",
                        job = "Android Developer",
                        image = R.drawable.andguy
                    )
                )
            }
        }
    }
}
