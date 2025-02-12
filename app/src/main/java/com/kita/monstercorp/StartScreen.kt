package com.kita.monstercorp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StartScreen(onClickGame: () -> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column {
            Text(
                text = "Start Screen",
                modifier = Modifier.padding(innerPadding)
            )
            Button(onClick = onClickGame) {
                Text("Go to Game")
            }
        }
    }
}