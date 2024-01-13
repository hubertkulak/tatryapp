package com.example.tatryapp.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Upsert
import com.example.tatryapp.data.Mountains
import kotlinx.coroutines.flow.Flow

@Dao
interface FavDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertNote(mountains: Mountains)

    @Delete
    suspend fun deleteNote(mountains: Mountains)

    @Query("SELECT * FROM mountains")
    fun getNotesOrderdByTitle(): List<Mountains>

    @Query("SELECT * FROM mountains WHERE id = :mountainId AND type = :type")
    fun getMountainById(mountainId: Int, type: String): Mountains

}