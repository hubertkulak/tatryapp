package com.example.tatryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import androidx.room.Room
import com.example.tatryapp.Navigation.Navigation
import com.example.tatryapp.data.local.FavDatabase


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
            Navigation(viewModel)
        }
    }
}

