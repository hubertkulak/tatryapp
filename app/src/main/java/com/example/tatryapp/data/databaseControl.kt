package com.example.tatryapp.data

import com.example.tatryapp.FavViewModel

fun addmountain(mountain: Mountains, viewModel: FavViewModel){
    viewModel.addMountains( Mountains(
        id = mountain.id,
        name = mountain.name,
        difficulty = mountain.difficulty,
        distance = mountain.distance,
        time = mountain.time,
        description =   mountain.description,
        mountainImageId = mountain.mountainImageId,
        latitude = mountain.latitude,
        longitude = mountain.longitude,
        elevation = mountain.elevation,
        route = mountain.route,
        type = mountain.type
    ))
}