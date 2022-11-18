package com.example.zadaniezaliczeniowe

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Pancakes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pancakes_layout)


        val buttonThree = findViewById<Button>(R.id.button3)
        buttonThree.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    fun submitData(view: View) {
        val cb6 = findViewById<CheckBox>(R.id.checkBox6)
        val cb7 = findViewById<CheckBox>(R.id.checkBox7)
        val cb8 = findViewById<CheckBox>(R.id.checkBox8)
        val cb9 = findViewById<CheckBox>(R.id.checkBox9)
        val cb10 = findViewById<CheckBox>(R.id.checkBox10)
        val cb11 = findViewById<CheckBox>(R.id.checkBox11)

        if (cb6.isChecked || cb7.isChecked || cb8.isChecked || cb9.isChecked || cb10.isChecked ||
            cb11.isChecked
        ) {
            Toast.makeText(applicationContext, "Produkt zakupiony", Toast.LENGTH_SHORT).show()
        }

    }
}