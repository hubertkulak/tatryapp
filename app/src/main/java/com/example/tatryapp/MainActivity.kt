package com.example.tatryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import androidx.room.Room
import com.example.tatryapp.Navigation.Navigation
import com.example.tatryapp.data.local.FavDatabase
import com.example.tatryapp.presentation.BottomBar
import com.example.tatryapp.ui.theme.TatryappTheme
import androidx.compose.ui.Modifier


class MainActivity : ComponentActivity() {

    private val firstviewModel: MainViewModel by viewModels()

    private val database by lazy {
        Room.databaseBuilder(
            applicationContext,
            FavDatabase::class.java,
            "mountains.db"
        ).allowMainThreadQueries().build()
    }

    private val viewModel by viewModels<FavViewModel> (
        factoryProducer = {
            object : ViewModelProvider.Factory {
                override fun<T: ViewModel> create(modelClass: Class<T>): T {
                    return FavViewModel(database.favDao) as T
                }
            }
        }
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        installSplashScreen().apply {
            setKeepOnScreenCondition {
                !firstviewModel.isReady.value
            }
        }

        setContent {
            TatryappTheme {

                val navController: NavHostController = rememberNavController()
                var buttonsVisible = remember { mutableStateOf(true) }

                Scaffold(
                    bottomBar = {
                        BottomBar(
                            navController = navController,
                            state = buttonsVisible,
                            modifier = Modifier
                        )
                    }) { paddingValues ->
                    Box(
                        modifier = Modifier.padding(paddingValues)
                    ) {
                        Navigation(viewModel = viewModel, navController = navController)
                    }

                    //  Navigation(viewModel)

                }


            }
        }
    }
}

