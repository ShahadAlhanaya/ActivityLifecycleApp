package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "This is onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("MainActivity", "This is onStart")

    }

    override fun onResume() {
        super.onResume()

        Log.d("MainActivity", "This is onResume")

    }

    override fun onPause() {
        super.onPause()

        Log.d("MainActivity", "This is onPause")

    }

    override fun onStop() {
        super.onStop()

        Log.d("MainActivity", "This is onStop")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("MainActivity", "This is onDestroy")

    }
}