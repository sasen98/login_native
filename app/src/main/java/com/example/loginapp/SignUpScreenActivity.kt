package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class SignUpScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_screen)
        val signUpBtn: Button = findViewById(R.id.signUp_btn)
        val loginText: TextView = findViewById(R.id.login_text)
        val userName: EditText = findViewById(R.id.signUpUserNameEditText)
        val password: EditText = findViewById(R.id.signUpPasswordEditText)
        signUpBtn.setOnClickListener {
                val uname = userName.text.toString()
                val pass = password.text.toString()
                print("Username:${uname} Password:${pass}");
                val intent = Intent(this, HomeScreenActivity::class.java)
                startActivity(intent)
        }
        loginText.setOnClickListener{
            val intent = Intent(this, LoginScreenActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}