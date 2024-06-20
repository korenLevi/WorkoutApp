package com.krs.workoutsapp

import android.app.Application
import androidx.compose.ui.window.application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {

    val name = mutableListOf<String>()
    val age = mutableListOf<Int>()
    val weight = mutableListOf<Float>()
}