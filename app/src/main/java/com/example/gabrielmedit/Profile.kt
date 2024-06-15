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

class Profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.profile)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Переход в меню
        var profileSideMenu_btn1 = findViewById<ImageView?>(R.id.profileSideMenu_btn);
        profileSideMenu_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        //Переход в main
        var profileHome_btn1 = findViewById<ImageView?>(R.id.profileHome_btn);
        profileHome_btn1.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //Переход в аудиозаписи
        var profileSounds_btn1 = findViewById<ImageView?>(R.id.profileSounds_btn);
        profileSounds_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Listen::class.java)
            startActivity(intent)
        }

        //Переход в фото
        var photo1_1 = findViewById<ImageView?>(R.id.photo1);
        photo1_1.setOnClickListener {
            val intent: Intent = Intent(this, Photo::class.java)
            startActivity(intent)
        }

        //Переход в логин
        var profileExit_btn1 = findViewById<TextView?>(R.id.profileExit_btn);
        profileExit_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}