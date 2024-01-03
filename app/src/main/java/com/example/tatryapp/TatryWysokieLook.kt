package com.example.tatryapp

import android.security.identity.AccessControlProfile
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tatryapp.data.DataProvider
import com.example.tatryapp.data.Mountains

@Composable
fun TatryWysokieLook(navController: NavController)
{
    val mount = remember { DataProvider.mountainList}

    LazyColumn(
        modifier = Modifier.background(color = Color.Black),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = mount,
            itemContent = {
                MountainListItem(mountains = it,
                    onClick = {selectedMountain -> navController.navigate("mountainDetail/${selectedMountain.id}")})
            })
    }

}
