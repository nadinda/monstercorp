package com.kita.monstercorp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun StartScreen(modifier: Modifier = Modifier, onClickGame: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xff06131D),
                            Color(0xff071925),
                            Color(0xff103550),
                            Color(0xff1C5B85),
                        )
                    )
                )
                .padding(innerPadding)
                .padding(vertical = 64.dp, horizontal = 16.dp)
        ){
            Text(
                text = "Start Screen",
                color = Color.White
            )
            Button(onClick = onClickGame) {
                Text("Go to Game")
            }
        }
    }
}