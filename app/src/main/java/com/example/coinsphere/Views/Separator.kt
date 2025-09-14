package com.example.coinsphere.Views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim

@Composable
fun Separator(){
    // Separador
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 25.dp, end = 20.dp, bottom = 5.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = "#   Name",
            color = TextDim,
            fontSize = 14.sp
        )
        Text(
            text = "Price",
            color = TextDim,
            fontSize = 14.sp
        )
    }
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .height(3.dp)
            .background(Surface)
    )
}