package com.example.loginapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class LoginScreenActivity : AppCompatActivity() {
    lateinit var userInput : EditText
    lateinit var passwordInput : TextInputLayout
    lateinit var loginBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)
        userInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)
        loginBtn.setOnClickListener{
            val userName = userInput.text.toString();
            val password =  passwordInput.editText?.text.toString();
        }
    }
}