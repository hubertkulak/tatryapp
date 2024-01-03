package com.example.tatryapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tatryapp.data.Mountains

@Composable
fun MountainListItem(mountains: Mountains, onClick: (Mountains) -> Unit){
    Card (
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row{
            MountainImage(mountains)
            Column (
                modifier = Modifier
                    .clickable { onClick(mountains) }
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ){
                Text(text = mountains.name, style = typography.bodyLarge)
                Text(text = "VIEW DETAIL", style = typography.bodyMedium)
            }
        }
    }
}

@Composable
private fun MountainImage(mountains: Mountains) {
    Image(
        painter = painterResource(id = mountains.mountainImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}

@Composable
fun MountainListItemZach(mountainsZach: Mountains, onClick: (Mountains) -> Unit){
    Card (
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray),
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row{
            MountainImage(mountainsZach)
            Column (
                modifier = Modifier
                    .clickable { onClick(mountainsZach) }
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ){
                Text(text = mountainsZach.name, style = typography.bodyLarge)
                Text(text = "VIEW DETAIL", style = typography.bodyMedium)
            }
        }
    }
}

