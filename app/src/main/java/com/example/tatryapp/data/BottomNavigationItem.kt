package com.example.tatryapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.tatryapp.Navigation.Screen

data class BottomNavigationItem(
    val label : String = "",
    val icon : ImageVector = Icons.Filled.Home,
    val route : String = ""
) {

    //function to get the list of bottomNavigationItems
    fun bottomNavigationItems() : List<BottomNavigationItem> {
        return listOf(
            BottomNavigationItem(
                label = "Ekran Główny",
                icon = Icons.Filled.Home,
                route = Screen.MainScreen.route
            ),
            BottomNavigationItem(
                label = "Ulubione",
                icon = Icons.Filled.Favorite,
                route = Screen.Ulubione.route
            ),
            BottomNavigationItem(
                label = "Zdobyte",
                icon = Icons.Filled.Done,
                route = Screen.Zdobyte.route
            ),
        )
    }
}