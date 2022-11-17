package com.example.zadaniezaliczeniowe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Stew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stew_layout)


        val textChecked = "Produkt zakupiony"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, textChecked, duration)


        val buttonFour = findViewById<Button>(R.id.button4)
        buttonFour.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}