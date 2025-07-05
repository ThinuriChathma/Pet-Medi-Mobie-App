package com.example.petmedi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class MainActivity8 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doctor_detail_page)
    }
    fun onBookAppointment(view: View) {
        val intent = Intent(this, MainActivity9::class.java)
        startActivity(intent)
    }
}