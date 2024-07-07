package com.example.auto_complete_text_view
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countries=resources.getStringArray(R.array.countries)
        val arrayAdapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)
        val actv=findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        actv.setAdapter(arrayAdapter)
    }
}