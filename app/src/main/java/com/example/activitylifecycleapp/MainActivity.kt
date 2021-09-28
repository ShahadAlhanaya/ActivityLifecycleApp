package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var floatingActionButton: FloatingActionButton
    lateinit var textView: TextView
    var flag = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView = findViewById(R.id.textView)
        floatingActionButton = findViewById(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener {
            if(flag){
                flag = !flag
                textView.setTextColor(ContextCompat.getColor(this,R.color.purple_200))
            }else{
                flag = !flag
                textView.setTextColor(ContextCompat.getColor(this,R.color.black))

            }
        }

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