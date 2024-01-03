package com.example.tatryapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tatryapp.data.DataProvider
import com.example.tatryapp.data.Mountains
import com.example.tatryapp.weather.WeatherForecastScreen

@Composable
fun MountainDetailScreenDoliny(navController: NavController, mountainDolinyId: Int) {
    val mountain = DataProvider.mountainListDoliny.firstOrNull { it.id == mountainDolinyId }
    val scrollState = rememberScrollState()
    if (mountain != null) {


        Column(modifier = Modifier.fillMaxSize()) {
            BoxWithConstraints {
                Surface {
                    Column(
                        modifier = Modifier
                            .background(color = Color.Black)
                            .fillMaxSize()
                            .verticalScroll(scrollState)
                    ) {
                        ProfileHeader(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                        ProfileContent(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                        Description(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                        WeatherForecastScreen(latitude = mountain.latitude, longitude = mountain.longitude)
                    }
                }
            }
        }
    } else {
        Text(text = "Brak informacji o tej górze")
    }
}
