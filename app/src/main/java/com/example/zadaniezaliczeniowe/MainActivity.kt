package com.example.zadaniezaliczeniowe

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
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

        val buttonSix = findViewById<Button>(R.id.button6)
        buttonSix.setOnClickListener()
        {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://github.com/PatrykNowak98"))
            startActivity(intent)
        }
        val buttonFive = findViewById<Button>(R.id.button5)
        buttonFive.setOnClickListener()
        {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://github.com/Piasta"))
            startActivity(intent)
        }
    }
}