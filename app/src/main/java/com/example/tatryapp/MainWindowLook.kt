package com.example.tatryapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController

@Composable
fun MainScreenLook(navController: NavController) {
    Column(
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxSize(),
    ) {
        Image(
            modifier = Modifier
                .height(450.dp)
                .paddingFromBaseline(0.dp, 1.dp),
            painter = painterResource(id = R.drawable.mainlook),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(5.dp))

        Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
            Column {

                Buttons(navController,"mountains", "Tatry Wysokie", "TatryWysokie")

                Buttons(navController,"mountains", "Tatry Zachodnie", "TatryZachodnie")


            }
            Column {
                Buttons(navController,"mountains", "Ulubione", "Zakopane")

                Buttons(navController,"mountains", "Informacje GOPR", "Doliny")


            }
        }
    }
}

    @Composable
    fun Buttons(navController: NavController,
        obraz : String,
        opis : String,
        destination : String
    ){
        var s = R.drawable.mainlook
        if(obraz =="mountains") {
            s = R.drawable.mountains
        }else{
            s = R.drawable.mainlook
        }
        Button(modifier = Modifier.padding(10.dp).height(100.dp).width(170.dp),
            colors = ButtonDefaults.buttonColors(containerColor =  Color.White),
            onClick = {
                navController.navigate(Screen.TatryZachodnie.route)
                })
        {
            Column(
                modifier = Modifier.padding(5.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = s),
                    contentDescription = "Image",
                    modifier = Modifier
                        .height(25.dp)
                        .width(25.dp)
                )

                Text(
                    opis,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }


        }
    }

