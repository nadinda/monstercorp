package com.kita.monstercorp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.kita.monstercorp.navigation.NavigationHost
import com.kita.monstercorp.ui.theme.MonsterCorpTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MonsterCorpTheme {
                val navController = rememberNavController()
                NavigationHost(navController = navController)

            }
        }
    }
}