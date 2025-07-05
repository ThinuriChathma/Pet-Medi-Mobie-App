package com.example.petmedi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import kotlinx.coroutines.newFixedThreadPoolContext
import androidx.appcompat.app.AppCompatActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_form)

    }
    fun onMainLayoutClick(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}
