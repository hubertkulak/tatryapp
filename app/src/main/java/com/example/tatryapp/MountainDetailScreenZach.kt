package com.example.tatryapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
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



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MountainDetailScreenZach(navController: NavController, mountainZachId: Int) {
    val mountain = DataProvider.mountainListZach.firstOrNull { it.id == mountainZachId }
    val scrollState = rememberScrollState()

    if (mountain != null) {

        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())




        Scaffold(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),

            topBar = {
                CenterAlignedTopAppBar(
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Black,
                        titleContentColor = Color.White,
                    ),
                    title = {
                        Text(
                            mountain.name,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    },
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "Localized description",
                                tint = Color.White

                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = {

                        }) {
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = "Localized description",
                                tint = Color.Red,
                            )
                        }
                    },
                    scrollBehavior = scrollBehavior,
                )
            },
        ) { innerPadding ->
            ScrollContent(innerPadding)
            Column(modifier = Modifier.fillMaxSize()) {
                BoxWithConstraints {
                    Surface {
                        Column(
                            modifier = Modifier
                                .background(color = Color.Black)
                                .fillMaxSize()
                                .verticalScroll(scrollState)
                        ) {
                            ProfileHeader(
                                mountain = mountain,
                                containerHeight = this@BoxWithConstraints.maxHeight
                            )
                            ProfileContent(
                                mountain = mountain,
                                containerHeight = this@BoxWithConstraints.maxHeight
                            )
                            Description(
                                mountain = mountain,
                                containerHeight = this@BoxWithConstraints.maxHeight
                            )
                            WeatherForecastScreen(
                                latitude = mountain.latitude,
                                longitude = mountain.longitude
                            )
                        }
                    }
                }
            }
        }


    }
}


@Composable
fun ProfileHeader(
    mountain : Mountains,
    containerHeight: Dp
) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth()
            .padding(top = 80.dp),
        painter = painterResource(id = mountain.mountainImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}


@Composable
fun Description (mountain : Mountains, containerHeight: Dp)
{
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = mountain.description,
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White
        )
    }
}
@Composable
fun ProfileContent(mountain: Mountains, containerHeight: Dp) {
    Column {
       // Title(mountain)
        Spacer(modifier = Modifier.height(8.dp))
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 8.dp, bottom = 16.dp)
        ){

            ProfileProperty(label = stringResource(id = R.string.time), value = mountain.time)
            Spacer(modifier = Modifier.width(26.dp))
            ProfileProperty(label = stringResource(id = R.string.distance), value = mountain.distance)
            Spacer(modifier = Modifier.width(26.dp))
            ProfileProperty(label = stringResource(id = R.string.elevation), value = mountain.elevation)
        }
        Divider(modifier = Modifier.padding(bottom = 16.dp))
        Spacer(modifier = Modifier.padding(bottom = 16.dp))
        ProfileProperty(label = stringResource(id = R.string.route), value = mountain.route)
        Spacer(modifier = Modifier.height(32.dp))
        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
private fun Title(mountain: Mountains)
{
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = mountain.name,
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.Bold,
            color = Color.White
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
            style = MaterialTheme.typography.titleMedium,
            color = Color.White
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.White,
            overflow = TextOverflow.Visible
        )
    }
}

@Composable
fun ScrollContent(innerPadding: PaddingValues) {

}

