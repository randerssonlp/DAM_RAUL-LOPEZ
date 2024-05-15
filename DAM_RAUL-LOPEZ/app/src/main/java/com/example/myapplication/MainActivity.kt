package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener { view: View? ->
            Toast.makeText(
                this,
                "Se envió sus datos",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}