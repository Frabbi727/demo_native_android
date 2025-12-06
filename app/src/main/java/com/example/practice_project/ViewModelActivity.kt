package com.example.practice_project

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.practice_project.viewmodels.CounterViewModel

class ViewModelActivity : AppCompatActivity() {
    // Get ViewModel instance using viewModels() delegate
    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)

        // Find views by ID
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val tvMessage = findViewById<TextView>(R.id.tvMessage)
        val btnIncrement = findViewById<Button>(R.id.btnIncrement)

        // Observe counter LiveData
        // When the counter value changes in ViewModel, the UI updates automatically
        viewModel.counter.observe(this) { count ->
            tvCounter.text = "Counter: $count"
        }

        // Observe message LiveData
        // When the message value changes in ViewModel, the UI updates automatically
        viewModel.message.observe(this) { message ->
            tvMessage.text = message
        }

        // Set click listener to increment counter
        btnIncrement.setOnClickListener {
            viewModel.incrementCounter()
        }

        // Long click to reset counter
        btnIncrement.setOnLongClickListener {
            viewModel.resetCounter()
            true
        }
    }
}