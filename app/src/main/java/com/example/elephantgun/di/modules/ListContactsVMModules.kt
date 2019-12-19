package com.example.elephantgun.di.modules

import com.example.elephantgun.di.PearActivity
import com.example.elephantgun.listcontacts.ListContactsVM
import dagger.Module
import dagger.Provides

@Module
open class ListContactsVMModules {
    @Provides
    @PearActivity //Annotation creating per annotation Scope
    fun provideListContactVm(string: String): ListContactsVM {
        return ListContactsVM(string)
    }

}