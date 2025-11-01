package com.example.smd_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        var signupbtn=findViewById<Button>(R.id.signup_tab)
        signupbtn.setOnClickListener {
            val intent = android.content.Intent(this, Signup::class.java)
            startActivity(intent)
        }

    }
}