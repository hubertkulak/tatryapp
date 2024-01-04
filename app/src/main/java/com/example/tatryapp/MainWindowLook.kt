package com.example.tatryapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController

@Composable
fun MainScreenLook(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Buttons(navController, R.drawable.dolinakoscieliska, "Tatry Wysokie", "TatryWysokie")
            }
            item {
                Buttons(navController, R.drawable.koscielec, "Tatry Zachodnie", "TatryZachodnie")
            }
            item {
                Buttons(navController, R.drawable.dolinabialego, "Doliny i przełęcze", "Doliny")
            }
            item {
                Buttons(navController, R.drawable.rohacze, "Ulubione", "Ulubione")
            }
        }
    }
}

@Composable
fun Buttons(navController: NavController, imageId: Int, opis: String, destination: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .clickable

            {
                when (destination) {
                    "TatryWysokie" -> navController.navigate(Screen.TatryWysokie.route)
                    "TatryZachodnie" -> navController.navigate(Screen.TatryZachodnie.route)
                    "Doliny" -> navController.navigate(Screen.Doliny.route)
                    "Ulubione" -> navController.navigate(Screen.Ulubione.route)
                }
            },
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center,
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "Background Image",
                contentScale = ContentScale.Crop,

                modifier = Modifier
                    .fillMaxSize()
            )

            Column(
                modifier = Modifier.padding(5.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                // verticalArrangement = Arrangement.Center
            ) {
                Text(
                    opis,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 26.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}
