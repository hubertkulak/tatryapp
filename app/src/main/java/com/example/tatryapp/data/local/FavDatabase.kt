package com.example.tatryapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tatryapp.data.Mountains

@Database(entities = [Mountains::class], version = 1)
abstract class FavDatabase : RoomDatabase() {

    abstract val favDao : FavDao


}