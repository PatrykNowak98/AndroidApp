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
        


        val buttonFour = findViewById<Button>(R.id.button4)
        buttonFour.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun submitData(view: View) {
        val cb1 = findViewById<CheckBox>(R.id.checkBox)
        val cb2 = findViewById<CheckBox>(R.id.checkBox2)
        val cb3 = findViewById<CheckBox>(R.id.checkBox3)
        val cb4 = findViewById<CheckBox>(R.id.checkBox4)
        val cb5 = findViewById<CheckBox>(R.id.checkBox5)

        if (cb1.isChecked || cb2.isChecked || cb3.isChecked || cb4.isChecked || cb5.isChecked) {
            Toast.makeText(applicationContext, "Produkt posiadany", Toast.LENGTH_SHORT).show()
        }
    }
}