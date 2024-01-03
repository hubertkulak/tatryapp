package com.example.tatryapp.weather

data class WeatherInfo(
    val main: MainInfo,
    val weather: List<Weather>,
    val dt_txt: String,
    // Data i czas prognozy
)