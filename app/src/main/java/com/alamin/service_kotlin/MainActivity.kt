package com.alamin.service_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            Intent(this, MyService::class.java).also {
                startService(it)
                txtStatus.text = "Service Is Running"
            }
        }

        btnEnd.setOnClickListener {
            Intent(this, MyService::class.java).also {
                stopService(it)
                txtStatus.text = "Service Stopped"
            }
        }

        btnSend.setOnClickListener {
            Intent(this, MyService::class.java).also {
                val dataString = txtData.text.toString();
                it.putExtra("EXTRA",dataString)
                startService(it)
            }
        }

    }
}