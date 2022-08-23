package com.example.mytest

import android.util.Log
import kotlinx.coroutines.delay

open class Engine (
    var temp: Int,
    var isTurnedOn: Boolean
){

    suspend fun turnOn(){
        isTurnedOn = true
        delay(5000)
        temp = 95

        Log.d("COURSETAG", "coroutine suspended - resumed")
    }

    fun turnOff(){
        isTurnedOn = false
        temp = 20
    }
}
