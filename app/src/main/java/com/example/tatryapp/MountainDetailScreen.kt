package com.example.tatryapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tatryapp.data.DataProvider
import com.example.tatryapp.data.Mountains
import com.example.tatryapp.weather.WeatherForecastScreen

@Composable
fun MountainDetailScreen(navController: NavController, mountainId: Int) {
    val mountain = DataProvider.mountainList.firstOrNull { it.id == mountainId }

    if (mountain != null) {


        Column(modifier = Modifier.fillMaxSize()) {
            BoxWithConstraints {
                Surface {
                    Column(
                        modifier = Modifier
                            .background(color = Color.Black)
                            .fillMaxSize()
                    ) {
                        ProfileHeader(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                        Title(mountain = mountain)
                        Divider(modifier = Modifier.padding( 4.dp ))
                      //  WeatherForecastScreen(latitude = mountain.latitude, longitude = mountain.longitude)
                    }
                }
            }
        }
    } else {
        Text(text = "Brak informacji o tej górze")
    }
}


@Composable
private fun ProfileHeader(
    mountain : Mountains,
    containerHeight: Dp
) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = mountain.mountainImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun Title(
    mountain: Mountains
) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)) {
        Text(
            text = mountain.name,
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}