package com.example.petmedi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity18 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_page)
        }

    fun onCloseClick(view: View) {
        val intent = Intent(this, MainActivity7::class.java)
        startActivity(intent)
    }
    fun homeonClick(view: View) {
        val intent = Intent(this, MainActivity7::class.java)
        startActivity(intent)
    }
    fun profileonClick(view: View) {
        val intent = Intent(this, MainActivity17::class.java)
        startActivity(intent)
    }
    fun petManageClick(view: View) {
        val intent = Intent(this, MainActivity19::class.java)
        startActivity(intent)
    }

    fun onClickNotification(view: View) {
        val intent = Intent(this, NotificationPageActivity::class.java)
        startActivity(intent)
    }

    fun onClickPayment(view: View) {
        val intent = Intent(this, AllPaymentPageActivity::class.java)
        startActivity(intent)
    }

    fun mypetClick(view: View) {
        val intent = Intent(this, MainActivity20::class.java)
        startActivity(intent)
    }

    }
