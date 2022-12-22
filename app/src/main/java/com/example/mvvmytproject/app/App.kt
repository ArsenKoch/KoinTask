package com.example.mvvmytproject.app

import android.app.Application
import com.example.mvvmytproject.di.appModule
import com.example.mvvmytproject.di.dataModule
import com.example.mvvmytproject.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)C
            androidContext(this@App)
            modules(listOf(domainModule, dataModule, appModule))
        }
    }
}