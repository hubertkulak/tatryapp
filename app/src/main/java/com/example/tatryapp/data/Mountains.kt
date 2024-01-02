package com.example.tatryapp.data

data class Mountains (
        val id: Int,
        val name: String,
        val difficulty: Int,
        val distance: Int,
        val time: Int,
        val description: String,
        val mountainImageId: Int = 0
)