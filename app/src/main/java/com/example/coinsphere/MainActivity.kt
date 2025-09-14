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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.Image
import coil3.compose.AsyncImage
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
        CoinModel("Bitcoin", "https://cdn-icons-png.flaticon.com/128/5968/5968260.png", 109797.37),
        CoinModel("Ethereum", "https://cdn-icons-png.flaticon.com/128/15301/15301597.png", 4321.21),
        CoinModel("Tether", "https://cdn-icons-png.flaticon.com/128/12114/12114244.png", 1.0000),
        CoinModel("XRP", "https://cdn-icons-png.flaticon.com/128/6675/6675835.png", 2.8100),
        CoinModel("BNB", "https://cdn-icons-png.flaticon.com/128/12114/12114208.png", 845.0000),
        CoinModel("Solana", "https://cdn-icons-png.flaticon.com/128/6001/6001527.png", 201.8500),
        CoinModel("USDC", "https://cdn-icons-png.flaticon.com/128/14446/14446284.png", 0.9998),
        CoinModel("Dogecoin", "https://cdn-icons-png.flaticon.com/128/7320/7320825.png", 0.1320),
        CoinModel("TRON", "https://cdn-icons-png.flaticon.com/128/12114/12114250.png", 0.3630),
        CoinModel("Cardano", "https://cdn-icons-png.flaticon.com/128/7016/7016514.png", 0.9213),
        CoinModel("Litecoin", "https://cdn-icons-png.flaticon.com/128/3938/3938179.png", 117.78),
        CoinModel("Chainlink", "https://cdn-icons-png.flaticon.com/128/6557/6557085.png", 25.09)
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
            modifier = Modifier
                .padding(start = 12.dp, top = 5.dp, end = 12.dp, bottom = 20.dp)
        ){
            items(items = coins.withIndex().toList()) { (index, coin) ->
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, top = 12.dp, end = 8.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Surface),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Row (
                        modifier = Modifier
                            .padding(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "${index + 1}",
                            color = TextMain,
                            modifier = Modifier
                                .padding(end = 10.dp)
                        )
                        AsyncImage(
                            model = coin.coinImage,
                            contentDescription = null,
                            modifier = Modifier
                                .height(30.dp),
                            contentScale = ContentScale.Fit
                        )
                        Text(
                            text = coin.coinName,
                            color = TextMain,
                            modifier = Modifier
                                .padding(start = 10.dp)
                        )
                    }
                    Row (
                        modifier = Modifier
                            .padding(20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "$${coin.coinPrice}",
                            color = TextMain
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