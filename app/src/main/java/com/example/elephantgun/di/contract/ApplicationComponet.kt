package com.example.elephantgun.di.contract

import com.example.elephantgun.di.PearActivity
import com.example.elephantgun.di.modules.ListContactsVMModules
import com.example.elephantgun.listcontacts.ListContactsActivity
import dagger.Component

@PearActivity
@Component(modules = [ListContactsVMModules::class])
interface ApplicationComponet {
    fun inject(listContactsActivity: ListContactsActivity)
}