package com.example.tatryapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName="mountains")
data class Mountains (

        val name: String,
        val difficulty: Int,
        val distance: String,
        val time: String,
        val description: String,
        val mountainImageId: Int = 0,
        val latitude : Double,
        val longitude : Double,
        val elevation : String,
        val route : String,
        val type : String,
        @PrimaryKey(autoGenerate = false)
        val id: Int,

)