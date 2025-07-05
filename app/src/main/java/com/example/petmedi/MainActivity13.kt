package com.example.petmedi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity13 :  ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pet_accessories_page)

    }
    fun doctorClick(view: View) {
        val intent = Intent(this, MainActivity7::class.java)
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
    fun sideNavClick(view: View) {
        val intent = Intent(this, MainActivity18::class.java)
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

    fun onClickHomepage(view: View) {
        val intent = Intent(this, MainActivity7::class.java)
        startActivity(intent)
    }

    fun onProfileClick(view: View) {
        val intent = Intent(this, MainActivity17::class.java)
        startActivity(intent)
    }

}