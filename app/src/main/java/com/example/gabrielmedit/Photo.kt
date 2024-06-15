package com.example.gabrielmedit

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Photo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.photo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.photo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Переход в профиль
        var close_btn1 = findViewById<TextView?>(R.id.close_btn);
        close_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}