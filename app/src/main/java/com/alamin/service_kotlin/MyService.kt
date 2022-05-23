package com.alamin.service_kotlin

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

private const val TAG = "MyService"
class MyService : Service() {

    init {
        Log.d(TAG, "Service Is Running")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val dataString = intent?.getStringExtra("EXTRA")
        dataString?.let {
            Log.d(TAG, dataString)
        }
        return START_STICKY
    }

    override fun onBind(intent: Intent): IBinder? = null


}