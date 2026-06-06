package com.github.gabrielsilper.recyclerexercises.repositories

import com.github.gabrielsilper.recyclerexercises.R
import com.github.gabrielsilper.recyclerexercises.models.Car

class CarRepository {
    private val cars = listOf(
        Car(
            brand = "Fiat",
            model = "Uno",
            year = 2021,
            price = 45000.0,
            image = R.drawable.uno
        ),
        Car(
            brand = "Chevrolet",
            model = "Onix",
            year = 2023,
            price = 75000.0,
            image = R.drawable.onix
        ),
        Car(
            brand = "Hyundai",
            model = "HB20",
            year = 2023,
            price = 78000.0,
            image = R.drawable.hb20
        ),
        Car(
            brand = "Renault",
            model = "Kwid",
            year = 2024,
            price = 65000.0,
            image = R.drawable.kwid
        )
    )

    fun getCars(): List<Car> {
        return this.cars
    }
}