package com.example.tatryapp.Navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object TatryWysokie : Screen("tatrywysokie")
    object TatryZachodnie : Screen("tatryzachodnie")
    object Doliny : Screen("doliny")
    object Ulubione : Screen("ulubione")
    object Zdobyte : Screen("zdobyte")
}