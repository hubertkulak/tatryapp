package com.example.tatryapp.presentation

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tatryapp.FavViewModel
import com.example.tatryapp.data.DataProvider
import com.example.tatryapp.data.addmountain
import com.example.tatryapp.weather.WeatherForecastScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MountainDetailScreen(navController: NavController, mountainId: Int, viewModel: FavViewModel) {
    val mountain = DataProvider.mountainList.firstOrNull { it.id == mountainId }
    val scrollState = rememberScrollState()

    val mountainId = mountain?.id ?: -1 // Pobranie ID góry lub -1, jeśli obiekt jest nullem
    val type = mountain?.type ?: "null"
    val name = mountain?.name ?: "null"
    val mountainimage = mountain?.mountainImageId ?: 0

    val isChecked = remember {
        mutableStateOf(if (mountainId != -1) viewModel.isMountainChecked(mountainId, type) else false)
    }

    var dialogOpen by remember {
        mutableStateOf(false)
    }
    if(dialogOpen){
        DialogWindow(viewModel = viewModel, mountainimage = mountainimage, mountainid = mountainId,type = type, name = name,onDismissRequest = { dialogOpen = false }, onConfirmation = {dialogOpen = false})
    }

    val isFavorite = remember {
        mutableStateOf(if (mountainId != -1) viewModel.isMountainFavorite(mountainId, type) else false)
    }



    if (mountain != null) {

        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())

        val context = LocalContext.current
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

                        IconButton(onClick = {
                            if (isChecked.value) {
                                Toast.makeText(context, "Już zdobyłeś tą góre!", Toast.LENGTH_SHORT).show()
                            } else {
                                dialogOpen = true
                            }
                        }) {
                            Icon(
                                imageVector = if (isFavorite.value) Icons.Filled.Check else Icons.Outlined.Check,
                                contentDescription = "Localized description",
                                tint = Color.Green,
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
                            ProfileHeader(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                            ProfileContent(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                            Spacer(modifier = Modifier.height(15.dp ))
                            Description(mountain = mountain, containerHeight = this@BoxWithConstraints.maxHeight)
                            WeatherForecastScreen(latitude = mountain.latitude, longitude = mountain.longitude)
                        }
                    }
                }
            }
        }
    }
}
