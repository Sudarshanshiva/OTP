package com.example.otpthing.OTPThing

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen() {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Row {
            Box (
                modifier = Modifier
                    .size(120.dp)
                    .clickable {

                    }
                    .background(Color.Black, shape = RoundedCornerShape(8.dp))
                    .padding(30.dp),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Profile",
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box (
                modifier = Modifier
                    .size(120.dp)
                    .clickable {

                    }
                    .background(Color.Black, shape = RoundedCornerShape(8.dp))
                    .padding(30.dp),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Consult",
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Box (
                modifier = Modifier
                    .size(120.dp)
                    .clickable {

                    }
                    .background(Color.Black, shape = RoundedCornerShape(8.dp))
                    .padding(30.dp),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Client List",
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box (
                modifier = Modifier
                    .size(120.dp)
                    .clickable {

                    }
                    .background(Color.Black, shape = RoundedCornerShape(8.dp))
                    .padding(30.dp),
                contentAlignment = Alignment.Center
            ){
                Text(text = "Upcoming",
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }
        }



    }
}