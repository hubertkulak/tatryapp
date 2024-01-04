package com.example.tatryapp

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tatryapp.data.DataProvider
import com.example.tatryapp.data.Mountains

@Composable
fun Navigation(){
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
            UlubioneLook(navController = navController)
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
                MountainDetailScreen(navController = navController, mountainId = mountainId)
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
                MountainDetailScreenZach(navController = navController, mountainZachId = mountainZachId)
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
                MountainDetailScreenDoliny(navController = navController, mountainDolinyId = mountainDolinyId)
            } else {
                Text(text = "Brak informacji o tej górze")
            }
        }


    }
}

