package com.example.tatryapp.data

import androidx.room.DatabaseView
import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName="mountainschecked")
data class MountainsChecked (

        val name: String,
        val description: String,
        val type : String,
        @PrimaryKey(autoGenerate = false)
        val id: Int,

)