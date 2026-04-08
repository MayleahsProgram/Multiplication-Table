package com.example.multiplytable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Variables for design elements
        val numInput =findViewById<EditText>(R.id.numInput)
        val multiplyBtn = findViewById<Button>(R.id.multiplyBtn)

        //Button click listener for multiplication table
        multiplyBtn.setOnClickListener {
            val intent = Intent(this, TableDisplay::class.java)
            intent.putExtra("tableNumber", numInput.text.toString())
            startActivity(intent)
        }















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}