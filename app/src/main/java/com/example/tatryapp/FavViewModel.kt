package com.example.tatryapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tatryapp.data.Mountains
import com.example.tatryapp.data.MountainsChecked
import com.example.tatryapp.data.local.FavDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class FavViewModel(
    private val dao: FavDao
) : ViewModel() {

    fun getAllMountains(): Flow<List<Mountains>> {
        return dao.getNotesOrderdByTitle()
    }


    fun deleteMountains(mountains: Mountains) {
        viewModelScope.launch {
            dao.deleteNote(mountains)
        }
    }

    fun addMountains(mountains: Mountains) {
        viewModelScope.launch {
            dao.upsertNote(mountains)
        }
    }

    fun isMountainFavorite(mountainId: Int, type : String): Boolean {
        val mountain = dao.getMountainById(mountainId, type) // Pobranie góry z bazy danych po ID
        return mountain != null // Zwróć true, jeśli góra jest w bazie danych (jest ulubiona), w przeciwnym razie false
    }

    fun getAllMountainsChecked(): Flow<List<MountainsChecked>> {
        return dao.getCheckedOrderdByTitle()
    }

    fun deleteMountainsChecked(mountainsChecked: MountainsChecked) {
        viewModelScope.launch {
            dao.deleteChecked(mountainsChecked)
        }
    }

    fun addMountainsChecked(mountainsChecked: MountainsChecked) {
        viewModelScope.launch {
            dao.upsertChecked(mountainsChecked)
        }
    }

    fun isMountainChecked(mountainId: Int, type : String): Boolean {
        val mountain = dao.getMountainCheckById(mountainId, type) // Pobranie góry z bazy danych po ID
        return mountain != null // Zwróć true, jeśli góra jest w bazie danych (jest ulubiona), w przeciwnym razie false
    }

}