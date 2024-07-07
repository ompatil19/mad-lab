package com.example.myapplication

// MainActivity.kt
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateAmount(view: View) {
        val checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        val checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        val checkbox3 = findViewById<CheckBox>(R.id.checkbox3)

        var sum = 0

        if (checkbox1.isChecked) {
            sum += 1
        }

        if (checkbox2.isChecked) {
            sum += 2
        }

        if (checkbox3.isChecked) {
            sum += 3
        }

        val resultMessage = "Selected amount: $sum"
        Toast.makeText(this, resultMessage, Toast.LENGTH_SHORT).show()
    }
}
