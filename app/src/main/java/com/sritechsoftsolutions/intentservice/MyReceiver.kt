package com.sritechsoftsolutions.intentservice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.ImageView

class MyReceiver(var imageView: ImageView): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        imageView.setImageBitmap(bmp)
    }
}