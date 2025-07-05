package com.example.petmedi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_portal_page)
    }

    fun LoginClick(view: View) {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
    fun RegisterClick(view: View) {
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }


}