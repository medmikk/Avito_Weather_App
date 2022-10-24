package com.medmikk

import android.app.Application
import com.medmikk.avitoweatherapp.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(
                appModule,
                viewModelModule,
                retrofitModule,
                networkObserverModule
            )
        }
    }
}