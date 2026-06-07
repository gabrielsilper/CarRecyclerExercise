package com.github.gabrielsilper.recyclerexercises

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.gabrielsilper.recyclerexercises.adapters.CarAdapter
import com.github.gabrielsilper.recyclerexercises.repositories.CarRepository

class MainActivity : AppCompatActivity() {
    val carRepository by lazy {
        CarRepository()
    }

    val carsRecyclerView : RecyclerView by lazy {
        findViewById(R.id.carsRecyclerView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val carAdapter = CarAdapter(carRepository.getCars())

        carsRecyclerView.layoutManager = LinearLayoutManager(this)
        carsRecyclerView.adapter = carAdapter
    }
}