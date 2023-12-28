package com.example.tatryapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.tatryapp.ui.theme.TatryappTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().apply{
            setKeepOnScreenCondition{
                !viewModel.isReady.value
            }

        }
        setContent {
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Button(onClick = {
                    val navigate = Intent(this@MainActivity, TatryWysokie::class.java)
                    startActivity(navigate)
                }) {
                    Text(text = "Tatry Wysokie", fontSize = 18.sp)
                }
                Button(onClick = {
                    val navigate = Intent(this@MainActivity, TatryZachodnie::class.java)
                    startActivity(navigate)
                }) {
                    Text(text = "Tatry Zachodnie", fontSize = 18.sp)
                }
                Button(onClick = {
                    val navigate = Intent(this@MainActivity, Doliny::class.java)
                    startActivity(navigate)
                }) {
                    Text(text = "Doliny", fontSize = 18.sp)
                }
                Button(onClick = {
                    val navigate = Intent(this@MainActivity, Zakopane::class.java)
                    startActivity(navigate)
                }) {
                    Text(text = "Atrakcje Zakopanego", fontSize = 18.sp)
                }

            }
        }
    }
}