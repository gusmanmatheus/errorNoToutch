package com.example.elephantgun

import android.app.Application
import com.example.elephantgun.di.contract.ApplicationComponet

class App : Application() {
    private lateinit var mApplication: ApplicationComponet
    override fun onCreate() {
        super.onCreate()

//      mApplication = DaggerApplicationComponet
//          .builder()
//              .listContactsVMModules( object : ListContactsVMModules(){}).build()
    }

}