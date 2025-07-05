package com.example.petmedi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class MainActivity7 : ComponentActivity() {
    private lateinit var contentContainer: FrameLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doctor_page)


    }
    fun doctorLayoutClick(view: View) {
        val intent = Intent(this, MainActivity8::class.java)
        startActivity(intent)
    }
    fun medicineClick(view: View) {
        val intent = Intent(this, MainActivity11::class.java)
        startActivity(intent)
    }



    fun foodClick(view: View) {
        val intent = Intent(this, MainActivity12::class.java)
        startActivity(intent)
    }

    fun accessoryClick(view: View) {
        val intent = Intent(this, MainActivity13::class.java)
        startActivity(intent)
    }
    fun onClickCalender(view: View) {
        val intent = Intent(this, MainActivity10::class.java)
        startActivity(intent)
    }
    fun onCartClick(view: View) {
        val intent = Intent(this, AddToCard2Activity::class.java)
        startActivity(intent)
    }
    fun sideNavClick(view: View) {
        val intent = Intent(this, MainActivity18::class.java)
        startActivity(intent)
    }
    fun onProfileClick(view: View) {
        val intent = Intent(this, MainActivity17::class.java)
        startActivity(intent)
    }


}