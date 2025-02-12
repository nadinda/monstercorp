package com.kita.monstercorp.navigation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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