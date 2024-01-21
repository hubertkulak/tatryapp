package com.example.tatryapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.WarningAmber
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tatryapp.FavViewModel
import com.example.tatryapp.data.Mountains
import com.example.tatryapp.data.MountainsChecked

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZdobyteLook(navController: NavController, viewModel: FavViewModel)
{


    val mountainsList by viewModel.getAllMountainsChecked().collectAsState(initial = emptyList())

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())




    Scaffold(
        modifier = Modifier
            .nestedScroll(scrollBehavior.nestedScrollConnection)
            .background(color = Color.Black),

        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.White,
                ),
                title = {
                    Text(
                        "Zdobyte",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },

                scrollBehavior = scrollBehavior,
            )
        },
    ) { innerPadding ->
        ScrollContent(innerPadding)
        Column(modifier = Modifier
            .background(color = Color.Black)
            .fillMaxHeight()
            .fillMaxWidth()) {

            LazyColumn(
                modifier = Modifier
                    .background(color = Color.Black)
                    .padding(top = 65.dp),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
            ) {

                items(
                    items = mountainsList,
                    itemContent = { mountainCheck ->
                        MountainListItemCheck(viewModel,
                            mountainsChecked = mountainCheck,
                        )
                    }
                )
            }
        }
    }

}

@Composable
fun MountainListItemCheck(viewModel: FavViewModel,mountainsChecked: MountainsChecked) {

    var youSure by remember { mutableStateOf(false) }

    if(youSure) {
        YouSureDialog(
            onDismissRequest ={youSure = false},
            onConfirmation = { viewModel.deleteMountainsChecked(mountainsChecked) ; youSure = false },
            dialogTitle = "Uwaga",
            dialogText = "Czy jesteś pewny, że chcesz usunąć zdobytą góre?",
            icon = Icons.Filled.WarningAmber
        )
    }

    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row {
            MountainImageCheck(mountainsChecked)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = mountainsChecked.name, style = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = mountainsChecked.opis, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(4.dp))
                RatingBarDisplay(currentRating = mountainsChecked.rating)
            }
            Spacer(modifier = Modifier.width(10.dp))

        }
        IconButton(onClick = { youSure = true }) {
            Icon(
                imageVector = Icons.Filled.Delete,
                contentDescription = "Delete",
                tint = Color.Gray
            )
        }
    }
}

@Composable
fun MountainImageCheck(mountainsChecked : MountainsChecked) {
    Image(
        painter = painterResource(id = mountainsChecked.mountainImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}
