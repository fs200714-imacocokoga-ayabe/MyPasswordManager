package com.e.mypassword

import android.app.Application

class MyPasswordApplication : Application() {

    companion object{
        lateinit var db: PasswordDatabase
    }

    override fun onCreate() {
        super.onCreate()
        db = PasswordDatabase.getInstance(applicationContext)
    }
}