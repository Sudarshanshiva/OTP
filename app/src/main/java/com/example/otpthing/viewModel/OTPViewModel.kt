package com.example.otpthing.viewModel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class OTPViewModel(application: Application):AndroidViewModel(application) {
    private val sharedPreferences = application.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

    fun isUserLoggedIn(): Boolean {
        return sharedPreferences.getBoolean("is_logged_in", false)
    }

    fun setUserLoggedIn(loggedIn: Boolean) {
        sharedPreferences.edit().putBoolean("is_logged_in", loggedIn).apply()
    }
}