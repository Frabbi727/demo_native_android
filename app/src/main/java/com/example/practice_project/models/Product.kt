package com.example.practice_project.models

// Kotlin version with optional parameters (like Flutter!)
data class Product(
    val id: Int,
    val name: String,
    val price: Double = 0.0,        // Optional with default
    val description: String = ""    // Optional with default
)