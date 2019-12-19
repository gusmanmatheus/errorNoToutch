package com.example.elephantgun.listcontacts

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class ListContactsVM @Inject constructor(val str: String) : ViewModel() {
    fun printa(): String {
        return str
    }
}