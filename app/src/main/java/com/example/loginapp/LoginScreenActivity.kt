package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)
        val loginBtn: Button = findViewById(R.id.login_btn)
        val signUpBtn: TextView = findViewById(R.id.signup_text)
        val userName: EditText = findViewById(R.id.userNameEditText)
        val password: EditText = findViewById(R.id.passwordEditText)
        loginBtn.setOnClickListener {
            val uname = userName.text.toString()
            val pass = password.text.toString()
           print("Username:${uname} Password:${pass}");
            val intent = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent)
            finish()
        }
        signUpBtn.setOnClickListener{
            val intent = Intent(this, SignUpScreenActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}