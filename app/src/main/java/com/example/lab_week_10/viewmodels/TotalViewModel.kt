package com.example.lab_week_10.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TotalViewModel: ViewModel() {
    private val _total = MutableLiveData<Int>(0)
    val total: LiveData<Int> = _total
    fun incrementTotal() {
        _total.value = (_total.value ?: 0) + 1
    }
//    var total: Int = 0
//    fun incrementTotal(): Int {
//        total++
//        return total
//    }
}