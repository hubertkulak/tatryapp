package com.example.tatryapp.data

data class Mountains (
        val id: Int,
        val name: String,
        val difficulty: Int,
        val distance: String,
        val time: String,
        val description: String,
        val mountainImageId: Int = 0,
        val latitude : Double,
        val longitude : Double,
        val elevation : String,
        val route : String
)