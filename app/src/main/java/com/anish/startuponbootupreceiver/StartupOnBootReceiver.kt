package com.anish.startuponbootupreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class StartupOnBootReceiver : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        Log.i("anisham", "anisham1:StartupOnBootReceiver")
        if (p1 != null) {
            Log.i("anisham", "anisham2:StartupOnBootReceiver")
            if (Intent.ACTION_BOOT_COMPLETED.equals(p1.action)) {
                Log.i("anisham", "anisham3:StartupOnBootReceiver")
                val intent = Intent(p0, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                //because we have to start new task whenever bootup is completed and this task will run out activity
                if (p0 != null) {
                    Log.i("anisham", "anisham4:StartupOnBootReceiver")
                    p0.startActivity(intent)
                }
            }

        }
    }
}