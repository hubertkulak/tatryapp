package com.example.tatryapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.tatryapp.R
import com.example.tatryapp.data.Mountains

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
            modifier = Modifier.padding(top=10.dp),
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

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp, bottom = 5.dp)
        ){

            ProfileProperty(label = stringResource(id = R.string.time), value = mountain.time)
            Spacer(modifier = Modifier.width(26.dp))
            ProfileProperty(label = stringResource(id = R.string.distance), value = mountain.distance)
            Spacer(modifier = Modifier.width(26.dp))
            ProfileProperty(label = stringResource(id = R.string.elevation), value = mountain.elevation)
        }
        Divider(modifier = Modifier.padding(bottom = 5.dp, end = 16.dp, start = 16.dp))
        Spacer(modifier = Modifier.padding(bottom = 5.dp))
        ProfileProperty(label = stringResource(id = R.string.route), value = mountain.route)
        Spacer(modifier = Modifier.height(10.dp))

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