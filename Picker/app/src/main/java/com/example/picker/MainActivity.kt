package com.example.picker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.widget.Button
import android.widget.DatePicker
import android.widget.TimePicker
import java.util.*
class MainActivity : AppCompatActivity() {
    private lateinit var btnDatePicker: Button
    private lateinit var btnTimePicker: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDatePicker = findViewById(R.id.btnDatePicker)
        btnTimePicker = findViewById(R.id.btnTimePicker)

        btnDatePicker.setOnClickListener {
            showDatePickerDialog()
        }

        btnTimePicker.setOnClickListener {
            showTimePickerDialog()
        }
    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _: DatePicker, selectedYear: Int, selectedMonth: Int, selectedDayOfMonth: Int ->
                // Do something with the selected date
                val selectedDate = "$selectedDayOfMonth/${selectedMonth + 1}/$selectedYear"
                // You can use the selectedDate variable to set the selected date wherever you want.
            },
            year,
            month,
            dayOfMonth
        )
        datePickerDialog.show()
    }

    private fun showTimePickerDialog() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { _: TimePicker, selectedHour: Int, selectedMinute: Int ->
                // Do something with the selected time
                val selectedTime = "$selectedHour:$selectedMinute"
                // You can use the selectedTime variable to set the selected time wherever you want.
            },
            hour,
            minute,
            true // 24 hour format
        )
        timePickerDialog.show()
    }
}