package com.sentra.shield.service
import android.app.*
import android.content.Intent
import android.os.IBinder
class MonitorService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        startForeground(1, Notification())
        return START_STICKY
    }
    override fun onBind(intent: Intent?): IBinder? = null
}
