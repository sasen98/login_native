package com.example.loginapp

import HomeScreenActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OtpScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_verification_screen)
        val otpSubmit: Button = findViewById(R.id.otpSubmit)
        val otp1: TextView = findViewById(R.id.otpBox1)
        val otp2: TextView = findViewById(R.id.otpBox2)
        val otp3: TextView = findViewById(R.id.otpBox3)
        val otp4: TextView = findViewById(R.id.otpBox4)

        otpSubmit.setOnClickListener{
            print("otp::: ${otp1}${otp2}${otp3}${otp4}")
            val intent = Intent(this, HomeScreenActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}