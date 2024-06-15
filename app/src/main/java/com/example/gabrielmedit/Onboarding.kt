package com.example.gabrielmedit

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboarding : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.onboarding)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Переход в логин
        var account_btn1 = findViewById<Button?>(R.id.account_btn);
        account_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        //Переход в регистрацию
        var registration_btn1 = findViewById<TextView?>(R.id.registration_btn);
        registration_btn1.setOnClickListener {
            val intent: Intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}