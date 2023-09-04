package com.mehedi.nota2302.di

import android.app.Application
import com.mehedi.nota2302.demo.MyActivityLifecycleCallbacks
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class NotaApp : Application() {



    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(MyActivityLifecycleCallbacks())
    }


}