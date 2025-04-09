package com.kita.monstercorp.navigation
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kita.monstercorp.GameScreen
import com.kita.monstercorp.StartScreen

@Composable
fun NavigationHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = StartRoute,
        modifier = modifier
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
    ) {
        composable<StartRoute> {
            StartScreen(onClickGame = { navigateToGame(navController = navController) })
        }
        composable<GameRoute> {
            GameScreen(onClickBack = { navigateBack(navController = navController) })
        }
    }
}

fun navigateBack(navController: NavHostController) {
    navController.navigateUp()
}

fun navigateToGame(navController: NavHostController) {
    navController.navigate(GameRoute)
}