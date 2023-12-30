package com.example.tatryapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

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
    }
}