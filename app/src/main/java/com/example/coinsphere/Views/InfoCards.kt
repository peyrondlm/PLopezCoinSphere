package com.example.coinsphere.Views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

@Composable
fun InfoCards() {
    // Información útil
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, top = 12.dp, end = 15.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Surface)
    ) {
        Column (
            modifier = Modifier
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)

        ) {
            Text(
                text = "Global Market Cap",
                color = TextDim,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
            Text(
                text = "$2.18T",
                color = TextMain,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )
        }
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, top = 12.dp, end = 15.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Surface)
    ) {
        Column (
            modifier = Modifier
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)

        ) {
            Text(
                text = "Fear & Greed",
                color = TextDim,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
            Text(
                text = "Neutral (54)",
                color = TextMain,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )
        }
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, top = 12.dp, end = 15.dp)
            .clip(RoundedCornerShape(18.dp))
            .background(Surface)
    ) {
        Column (
            modifier = Modifier
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)

        ) {
            Text(
                text = "Altcoin Season",
                color = TextDim,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )
            Text(
                text = "No",
                color = TextMain,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )
        }
    }
}