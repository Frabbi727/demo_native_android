package com.example.practice_project.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    // Private mutable LiveData - only the ViewModel can modify
    private val _counter = MutableLiveData<Int>(0)
    // Public immutable LiveData - activities can observe but not modify
    val counter: LiveData<Int> = _counter

    private val _message = MutableLiveData<String>("Welcome! Click the button to start counting.")
    val message: LiveData<String> = _message

    // Function to increment the counter
    fun incrementCounter() {
        val currentValue = _counter.value ?: 0
        _counter.value = currentValue + 1
        updateMessage(currentValue + 1)
    }

    // Function to update message based on counter value
    private fun updateMessage(count: Int) {
        _message.value = when {
            count == 0 -> "Welcome! Click the button to start counting."
            count < 5 -> "You've clicked $count times. Keep going!"
            count < 10 -> "Wow! $count clicks already. You're doing great!"
            count < 20 -> "Amazing! You've reached $count clicks!"
            else -> "Incredible! You've clicked $count times. You're unstoppable!"
        }
    }

    // Function to reset counter
    fun resetCounter() {
        _counter.value = 0
        updateMessage(0)
    }
}