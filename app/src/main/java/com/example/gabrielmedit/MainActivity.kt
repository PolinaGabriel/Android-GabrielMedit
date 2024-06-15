package com.example.gabrielmedit

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Переход в профиль
        var mainProfile_btn1 = findViewById<ImageView?>(R.id.mainProfile_btn);
        mainProfile_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        //Переход в меню
        var mainSideMenu_btn1 = findViewById<ImageView?>(R.id.mainSideMenu_btn);
        mainSideMenu_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        //Переход в аудиозаписи
        var mainSounds_btn1 = findViewById<ImageView?>(R.id.mainSounds_btn);
        mainSounds_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Listen::class.java)
            startActivity(intent)
        }
    }
}