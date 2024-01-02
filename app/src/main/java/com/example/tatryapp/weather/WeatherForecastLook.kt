package com.example.tatryapp.weather

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.unit.dp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import com.example.tatryapp.weather.Resource
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


// Interfejs Retrofit
interface WeatherService {
    @GET("data/2.5/forecast")
    suspend fun getWeatherForecast(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String,
        @Query("units") units: String, // Jednostki (np. metric, imperial)
        @Query("cnt") count: Int // Liczba pomiarów - 12 * 60 min / 2h = 6
    ): ForecastResponse
}

// Modele danych dla odpowiedzi API
data class ForecastResponse(
    val list: List<WeatherInfo>
)

// Funkcja Composable, która wyświetla prognozę pogody
@Composable
fun WeatherForecastScreen(latitude: Double, longitude: Double) {
    val apiKey = "e7c12da129cf3c20c4eef1d054dc6365"
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.openweathermap.org/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(WeatherService::class.java)

    val forecast by produceState<Resource<List<WeatherInfo>>>(initialValue = Resource.Loading) {
        try {
            val response = service.getWeatherForecast(latitude, longitude, apiKey, "metric", 12)
            value = Resource.Success(response.list)
        } catch (e: Exception) {
            value = Resource.Error("Błąd podczas pobierania prognozy: ${e.message}")
        }
    }

    when (val result = forecast) {
        is Resource.Success -> {
            val weatherList = result.data
            // Wyświetl dane pogodowe
            WeatherForecastList(weatherList)
        }
        is Resource.Loading -> {
            // Wyświetl animację lub komunikat ładowania
            CircularProgressIndicator()
        }
        is Resource.Error -> {
            // Wyświetl komunikat o błędzie
            Text(text = "Błąd: ${result.message}")
        }
    }
}

@Composable
fun WeatherForecastList(weatherList: List<WeatherInfo>) {
    // Wyświetl listę prognozy pogody
    LazyColumn {
        items(weatherList) { weatherInfo ->
            WeatherItem(weatherInfo)
        }
    }
}

@Composable
fun WeatherItem(weatherInfo: WeatherInfo) {
    // Wyświetl informacje o pogodzie dla pojedynczego wpisu
    // Tutaj możesz wyświetlić dane z weatherInfo, np. temperaturę, opis pogody, ikonę itp.

    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(containerColor = Color.Gray)
    ) {
        Text(text = "Time: ${weatherInfo.dt_txt}")
        Text(text = "Temperature: ${weatherInfo.main.temp}°C")
        Text(text = "Description: ${weatherInfo.weather.firstOrNull()?.description ?: ""}")
    }
}