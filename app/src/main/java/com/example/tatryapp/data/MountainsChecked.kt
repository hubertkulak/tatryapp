package com.example.tatryapp.data

import androidx.room.DatabaseView
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="mountainschecked")
data class MountainsChecked (

        val name: String,
        val opis: String,
        val type : String,
        val mountainImageId: Int = 0,
        val rating : Int = 0,
        @PrimaryKey(autoGenerate = false)
        val id: Int,

)