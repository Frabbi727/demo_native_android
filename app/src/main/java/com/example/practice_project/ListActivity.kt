package com.example.practice_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practice_project.adapters.ProductAdapter
import com.example.practice_project.models.Product

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        // Find RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Create sample data
        val products = getSampleProducts()

        // Set up RecyclerView with adapter and layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProductAdapter(products)
    }

    // Helper function to generate sample product data
    private fun getSampleProducts(): List<Product> {
        return listOf(
            Product(1, "Laptop", 999.99, "High-performance laptop for professionals"),
            Product(2, "Smartphone", 699.99, "Latest flagship smartphone with amazing camera"),
            Product(3, "Headphones", 199.99, "Noise-cancelling wireless headphones"),
            Product(4, "Tablet", 449.99, "Portable tablet for work and entertainment"),
            Product(5, "Smartwatch", 299.99, "Fitness tracker with heart rate monitor"),
            Product(6, "Keyboard", 79.99, "Mechanical keyboard with RGB lighting"),
            Product(7, "Mouse", 49.99, "Ergonomic wireless mouse"),
            Product(8, "Monitor", 349.99, "27-inch 4K display"),
            Product(9, "Webcam", 89.99, "HD webcam for video calls"),
            Product(10, "Speakers", 129.99, "Bluetooth speakers with deep bass"),
            Product(11, "External SSD", 159.99, "1TB portable storage with fast transfer speeds"),
            Product(12, "USB-C Hub", 45.99, "Multi-port adapter for laptops"),
            Product(13, "Gaming Console", 499.99, "Next-gen gaming console with 4K support"),
            Product(14, "VR Headset", 399.99, "Immersive virtual reality experience"),
            Product(15, "Drone", 799.99, "4K camera drone with GPS navigation"),
            Product(16, "Action Camera", 249.99, "Waterproof camera for adventures"),
            Product(17, "Power Bank", 39.99, "20,000mAh portable charger"),
            Product(18, "Wireless Charger", 29.99, "Fast charging pad for smartphones"),
            Product(19, "Smart Speaker", 99.99, "Voice-controlled assistant with premium sound"),
            Product(20, "Fitness Tracker", 149.99, "Health monitoring band with GPS"),
            Product(21, "E-Reader", 129.99, "Paperwhite display with adjustable lighting"),
            Product(22, "Projector", 549.99, "HD projector for home theater"),
            Product(23, "Router", 179.99, "WiFi 6 router with mesh support"),
            Product(24, "Network Switch", 89.99, "8-port gigabit ethernet switch"),
            Product(25, "Graphics Card", 1299.99, "High-end GPU for gaming and rendering"),
            Product(26, "RAM Module", 119.99, "16GB DDR4 memory stick"),
            Product(27, "Cooling Fan", 34.99, "RGB cooling fan with quiet operation"),
            Product(28, "Microphone", 149.99, "Studio-quality USB microphone"),
            Product(29, "Ring Light", 59.99, "LED ring light for photography and streaming"),
            Product(30, "Tripod", 44.99, "Adjustable tripod for cameras and phones")
        )
    }
}