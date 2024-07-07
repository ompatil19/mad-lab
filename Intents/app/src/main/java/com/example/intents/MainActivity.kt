package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val explicitIntentButton: Button = findViewById(R.id.explicitIntentButton)
        val implicitIntentButton: Button = findViewById(R.id.implicitIntentButton)

        explicitIntentButton.setOnClickListener {
            // Explicit Intent
            val explicitIntent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(explicitIntent)
        }

        implicitIntentButton.setOnClickListener {
            // Implicit Intent
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(implicitIntent)
        }
    }
}