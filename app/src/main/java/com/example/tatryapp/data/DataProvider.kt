package com.example.tatryapp.data

import com.example.tatryapp.R

object DataProvider {
    val mountains =
        Mountains(
            id = 1,
            name = "Monty",
            difficulty = 5,
            distance = 14,
            time = 60,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            mountainImageId = R.drawable.m1,
            latitude = 49.1880,
            longitude = 20.0911
    )

    val mountainList = listOf(
        mountains,
        Mountains(
            id = 2,
            name = "Gora",
            difficulty = 5,
            distance = 14,
            time = 60,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            mountainImageId = R.drawable.m2,
            latitude = 49.1880,
            longitude = 20.0911
        ),
        Mountains(
            id = 3,
            name = "Trzecia",
            difficulty = 5,
            distance = 14,
            time = 60,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            mountainImageId = R.drawable.m3,
            latitude = 49.1880,
            longitude = 20.0911
        ),
        Mountains(
            id = 4,
            name = "Czwarta",
            difficulty = 5,
            distance = 14,
            time = 60,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            mountainImageId = R.drawable.m4,
            latitude = 49.1880,
            longitude = 20.0911
        ),
        Mountains(
            id = 5,
            name = "Piata",
            difficulty = 5,
            distance = 14,
            time = 60,
            description = "Monty enjoys chicken treats and cuddling while watching Seinfeld.",
            mountainImageId = R.drawable.m5,
            latitude = 49.1880,
            longitude = 20.0911
        ),
    )
}
