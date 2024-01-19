package com.example.tatryapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tatryapp.data.Mountains
import com.example.tatryapp.data.MountainsChecked

@Database(entities =[MountainsChecked::class, Mountains::class], version = 1)
abstract class FavDatabase : RoomDatabase() {

    abstract val favDao : FavDao


}