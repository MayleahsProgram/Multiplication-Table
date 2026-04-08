package com.example.multiplytable

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class TableDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_table_display)
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        
        //Getting data from intent
        val tableString = intent.getStringExtra("tableNumber")
        
        //Prevention of crash if input is not  a number
        val tableNumber = tableString?.toIntOrNull() ?: 0
        val textView = findViewById<TextView>(R.id.textView)
        var tableText = "$tableNumber x table\n\n"
        
        var counter = 1
        while (counter <= 20){
            val answer = tableNumber * counter
            tableText += "$tableNumber x $counter = $answer\n\n"
            counter++
        }

        tableText.also { textView.text = it }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}