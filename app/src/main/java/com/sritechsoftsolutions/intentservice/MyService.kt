package com.sritechsoftsolutions.intentservice

import android.app.IntentService
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.InputStream
import java.net.URL

var bmp:Bitmap?=null
class MyService: IntentService("image") {
    override fun onHandleIntent(intent: Intent?) {

        var url=URL("https://images.pexels.com/photos/1386604/pexels-photo-1386604.jpeg?cs=srgb&dl=basket-beautiful-beauty-1386604.jpg&fm=jpg")
                var inputStream=url.openStream()
                 bmp=BitmapFactory.decodeStream(inputStream)

        var intent=Intent()
        intent.setAction("the task is completed")
        sendBroadcast(intent)


    }
}