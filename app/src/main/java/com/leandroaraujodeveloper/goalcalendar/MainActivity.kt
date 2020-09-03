package com.leandroaraujodeveloper.goalcalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView

class MainActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}