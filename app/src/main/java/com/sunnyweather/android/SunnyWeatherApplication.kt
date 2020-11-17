package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    companion object{
        @SuppressLint("StaticFiledLeak")
        lateinit var context : Context
        const val TOKEN = "4EQOp5Ac2jeji2ms"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}