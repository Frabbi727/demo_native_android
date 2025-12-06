package com.example.practice_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find buttons by ID
        val btnNavigateToList = findViewById<Button>(R.id.btnNavigateToList)
        val btnNavigateToViewModel = findViewById<Button>(R.id.btnNavigateToViewModel)

        // Set click listener for List screen button
        btnNavigateToList.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        // Set click listener for ViewModel screen button
        btnNavigateToViewModel.setOnClickListener {
            val intent = Intent(this, ViewModelActivity::class.java)
            startActivity(intent)
        }
    }
}