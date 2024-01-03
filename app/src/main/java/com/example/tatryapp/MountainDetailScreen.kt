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
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tatryapp.data.DataProvider
import com.example.tatryapp.data.Mountains
import com.example.tatryapp.weather.WeatherForecastScreen
import java.util.jar.Attributes.Name

@Composable
fun MountainDetailScreen(navController: NavController, mountainId: Int) {
    val mountain = DataProvider.mountainList.firstOrNull { it.id == mountainId }
    if (mountain != null) {

        Column(modifier = Modifier.fillMaxSize()) {
            BoxWithConstraints {
                Surface {
                    Column(
                        modifier = Modifier
                            .background(color = Color.White)
                            .fillMaxSize()
                    ) {
                        ProfileHeader(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                        ProfileContent(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                        Description(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                        // Title(mountain = mountain)
                        // Divider(modifier = Modifier.padding( 4.dp ))
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
private fun Description (mountain : Mountains, containerHeight: Dp)
{
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = mountain.description,
            style = MaterialTheme.typography.bodySmall
        )
    }
}
@Composable
private fun ProfileContent(mountain: Mountains, containerHeight: Dp) {
    Column {
        Title(mountain)
        Spacer(modifier = Modifier.height(8.dp))
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 8.dp, bottom = 16.dp)
        ){

            ProfileProperty(label = stringResource(id = R.string.difficulty), value = mountain.difficulty.toString())
            Spacer(modifier = Modifier.width(26.dp))
            ProfileProperty(label = stringResource(id = R.string.distance), value = mountain.distance.toString())
            Spacer(modifier = Modifier.width(26.dp))
            ProfileProperty(label = stringResource(id = R.string.elevation), value = mountain.elevation.toString())
        }
        Divider(modifier = Modifier.padding(bottom = 4.dp))
    }
}

@Composable
private fun Title(mountain: Mountains)
{
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = mountain.name,
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            // color = Color.White
        )
        Divider(modifier = Modifier.padding(top = 12.dp))
    }
}

@Composable
fun ProfileProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        // Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.titleSmall,
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodySmall,
            overflow = TextOverflow.Visible
        )
    }
}