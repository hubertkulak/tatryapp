package com.example.tatryapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tatryapp.FavViewModel
import com.example.tatryapp.data.Mountains
import com.example.tatryapp.data.MountainsChecked


@Composable
fun DialogWindow(viewModel: FavViewModel, mountainimage : Int,
    mountainid : Int,
    type : String,
    name : String,
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
) {
    var text by remember { mutableStateOf("")}
    var myRating by remember { mutableIntStateOf(3) }



    Dialog(onDismissRequest = { onDismissRequest() }) {
        // Draw a rectangle shape with rounded corners inside the dialog
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(375.dp)
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Text(
                    text = "Opisz swoją przygodę na szlaku! Jak oceniasz podejście?",
                    modifier = Modifier.padding(16.dp),
                )

                TextField(modifier = Modifier.padding(16.dp),
                    value = text,
                    onValueChange = {newText ->
                        text = newText
                }
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    TextButton(
                        onClick = { onDismissRequest() },
                        modifier = Modifier.padding(8.dp),
                    ) {
                        Text("Dismiss")
                    }
                    TextButton(
                        onClick = {
                            viewModel.addMountainsChecked(
                                MountainsChecked(
                                    name = name,
                                    type = type,
                                    id = mountainid,
                                    opis = text,
                                    mountainImageId = mountainimage,
                                    rating = myRating
                                )
                            )
                            onConfirmation()
                                  },
                        modifier = Modifier.padding(8.dp),
                    ) {
                        Text("Confirm")
                    }
                }
                RatingBar(
                    currentRating = myRating,
                    onRatingChanged = { myRating = it }
                )
            }
        }
    }
}