package com.example.tatryapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tatryapp.R
import com.example.tatryapp.Navigation.Screen

@Composable
fun MainScreenLook(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(50.dp)
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(56.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Buttons(navController, R.drawable.koscielec, "Tatry Wysokie", "TatryWysokie")
            }
            item {
                Buttons(navController, R.drawable.giewont, "Tatry Zachodnie", "TatryZachodnie")
            }
            item {
                Buttons(navController, R.drawable.dolinakoscieliska, "Doliny i przełęcze", "Doliny")
            }

        }
    }
}


@Composable
fun Buttons(navController: NavController, imageId: Int, opis: String, destination: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .clickable

            {
                when (destination) {
                    "TatryWysokie" -> navController.navigate(Screen.TatryWysokie.route)
                    "TatryZachodnie" -> navController.navigate(Screen.TatryZachodnie.route)
                    "Doliny" -> navController.navigate(Screen.Doliny.route)
                    "Ulubione" -> navController.navigate(Screen.Ulubione.route)
                    "Zdobyte" -> navController.navigate(Screen.Zdobyte.route)
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
                    fontSize = 20.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}
