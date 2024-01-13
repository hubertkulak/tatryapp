package com.example.tatryapp.Navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tatryapp.presentation.DolinyLook
import com.example.tatryapp.FavViewModel
import com.example.tatryapp.presentation.MainScreenLook
import com.example.tatryapp.presentation.MountainDetailScreen
import com.example.tatryapp.presentation.MountainDetailScreenDoliny
import com.example.tatryapp.presentation.MountainDetailScreenZach
import com.example.tatryapp.presentation.TatryWysokieLook
import com.example.tatryapp.presentation.TatryZachodnieLook
import com.example.tatryapp.presentation.UlubioneLook

@Composable
fun Navigation(viewModel: FavViewModel){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route ){
        composable(route = Screen.MainScreen.route){
            MainScreenLook(navController = navController)
        }

        composable(route = Screen.TatryWysokie.route){
            TatryWysokieLook(navController = navController)
        }

        composable(route = Screen.TatryZachodnie.route){
            TatryZachodnieLook(navController = navController)
        }
        composable(route = Screen.Doliny.route){
            DolinyLook(navController = navController)
        }
        composable(route = Screen.Ulubione.route){
            UlubioneLook(navController = navController, viewModel = viewModel)
        }
        composable(route = Screen.Zdobyte.route){
            ZdobyteLook(navController = navController)
        }

        composable(
            route = "mountainDetail/{mountainId}",
            arguments = listOf(navArgument("mountainId") { type = NavType.IntType })
        ) { backStackEntry ->
            val mountainId = backStackEntry.arguments?.getInt("mountainId")
            if (mountainId != null) {
                MountainDetailScreen(navController = navController, mountainId = mountainId, viewModel = viewModel)
            } else {
                Text(text = "Brak informacji o tej górze")
            }
        }

        composable(
            route = "mountainDetailZach/{mountainZachId}",
            arguments = listOf(navArgument("mountainZachId") { type = NavType.IntType })
        ) { backStackEntry ->
            val mountainZachId = backStackEntry.arguments?.getInt("mountainZachId")
            if (mountainZachId != null) {
                MountainDetailScreenZach(navController = navController, mountainZachId = mountainZachId,viewModel = viewModel)
            } else {
                Text(text = "Brak informacji o tej górze")
            }
        }

        composable(
            route = "mountainDetailDoliny/{mountainDolinyId}",
            arguments = listOf(navArgument("mountainDolinyId") { type = NavType.IntType })
        ) { backStackEntry ->
            val mountainDolinyId = backStackEntry.arguments?.getInt("mountainDolinyId")
            if (mountainDolinyId != null) {
                MountainDetailScreenDoliny(navController = navController, mountainDolinyId = mountainDolinyId, viewModel = viewModel)
            } else {
                Text(text = "Brak informacji o tej górze")
            }
        }


    }
}

