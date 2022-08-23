package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val e = Engine(95, false)
        val c = Car(20.0, e)
        c.turnOn()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}