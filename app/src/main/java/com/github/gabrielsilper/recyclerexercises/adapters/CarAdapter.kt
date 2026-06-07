package com.github.gabrielsilper.recyclerexercises.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.gabrielsilper.recyclerexercises.R
import com.github.gabrielsilper.recyclerexercises.models.Car
import java.text.NumberFormat
import java.util.Locale

class CarAdapter(val cars: List<Car>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = cars[position]
        holder.bind(car)
    }

    override fun getItemCount(): Int {
        return this.cars.size
    }

    class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(car: Car) {
            itemView.findViewById<ImageView>(R.id.carImage).setImageResource(car.image)
            itemView.findViewById<TextView>(R.id.carModel).text = car.model
            itemView.findViewById<TextView>(R.id.carBrand).text = car.brand
            itemView.findViewById<TextView>(R.id.carYear).text = car.year.toString()

            val brlFormat = NumberFormat.getCurrencyInstance()
            itemView.findViewById<TextView>(R.id.carPrice).text = brlFormat.format(car.price)
        }
    }
}