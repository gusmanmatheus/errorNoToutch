package com.example.elephantgun

import android.app.Application
import com.example.elephantgun.di.contract.ApplicationComponet
import com.example.elephantgun.di.contract.DaggerApplicationComponet
import com.example.elephantgun.di.modules.ListContactsVMModules

class App:Application() {
    private lateinit var mApplication: ApplicationComponet
    override fun onCreate() {
        super.onCreate()

//      mApplication = DaggerApplicationComponet
//          .builder()
//              .listContactsVMModules( object : ListContactsVMModules(){}).build()
    }

}