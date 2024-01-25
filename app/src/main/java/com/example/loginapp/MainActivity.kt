package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Install the splash screen
        installSplashScreen()

        // Perform time-consuming operations on a separate thread
        Thread {
            // Simulate a delay (remove this in production)
            Thread.sleep(3000)

            // Start the LoginScreenActivity
            runOnUiThread {
                val intent = Intent(this, LoginScreenActivity::class.java)
                startActivity(intent)

                // Close the MainActivity to prevent going back to it
                finish()
            }
        }.start()
    }
}