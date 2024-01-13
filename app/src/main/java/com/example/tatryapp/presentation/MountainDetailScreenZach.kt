package com.example.tatryapp.presentation

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
import androidx.compose.material.icons.outlined.FavoriteBorder
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
import com.example.tatryapp.FavViewModel
import com.example.tatryapp.R
import com.example.tatryapp.data.DataProvider
import com.example.tatryapp.data.Mountains
import com.example.tatryapp.data.addmountain
import com.example.tatryapp.weather.WeatherForecastScreen



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MountainDetailScreenZach(navController: NavController, mountainZachId: Int,viewModel: FavViewModel) {
    val mountain = DataProvider.mountainListZach.firstOrNull { it.id == mountainZachId }
    val scrollState = rememberScrollState()

    val mountainId = mountain?.id ?: -1 // Pobranie ID góry lub -1, jeśli obiekt jest nullem
    val type = mountain?.type ?: "null"

    val isFavorite = remember {
        mutableStateOf(if (mountainId != -1) viewModel.isMountainFavorite(mountainId, type) else false)
    }

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

                            if (isFavorite.value) {
                                viewModel.deleteMountains(mountain)
                                isFavorite.value = false
                            } else {
                                addmountain(mountain, viewModel)
                                isFavorite.value = true
                            }



                        }) {
                            Icon(
                                imageVector = if (isFavorite.value) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
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





