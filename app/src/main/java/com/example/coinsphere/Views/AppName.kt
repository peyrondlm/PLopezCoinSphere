package com.example.coinsphere.Views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.ui.theme.TextMain

@Composable
fun AppName() {
    // Nombre de la aplicación
    Row(
        modifier = Modifier
            .padding(start = 15.dp, top = 30.dp, end = 15.dp, bottom = 5.dp)
    ) {
        Text(
            text = "CoinSphere",
            color = TextMain,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}