package com.example.zadaniezaliczeniowe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOne = findViewById<Button>(R.id.button)
        buttonOne.setOnClickListener()
        {
        intent = Intent(this,Stew::class.java)
            startActivity(intent)
        }

        val buttonTwo = findViewById<Button>(R.id.button2)
        buttonTwo.setOnClickListener()
        {
            intent = Intent(this,Pancakes::class.java)
            startActivity(intent)
        }
    }
}