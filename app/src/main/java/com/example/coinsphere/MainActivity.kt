package com.example.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.DataClasses.CoinModel
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinSphereTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    // Monedas
    val coins = listOf(
        CoinModel("Bitcoin", "asdf", 109797.37),
        CoinModel("Ethereum", "asdf", 4321.21),
        CoinModel("Tether", "asdf", 1.0000)

    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
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
        // Línea que separa el nombre y precio de los elementos
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(Surface)
        )
        // Monedas
        LazyColumn (

        ){
            items(items = coins) { coin ->
                Row (
                    modifier = Modifier
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Row {
                        Text(
                            text = coin.coinName
                        )
                    }
                    Row {
                        Text(
                            text = "$${coin.coinPrice}"
                        )
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun HomeScreenPreview() {
    CoinSphereTheme {
        HomeScreen()
    }
}