package com.example.elephantgun.listcontacts

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.elephantgun.App
import com.example.elephantgun.R
import com.example.elephantgun.di.contract.ApplicationComponet
import com.example.elephantgun.di.contract.DaggerApplicationComponet
import com.example.elephantgun.di.modules.ListContactsVMModules

class ListContactsActivity : AppCompatActivity() {
    lateinit var viewModel: ListContactsVM
    private var listContactsVMModules = object : ListContactsVMModules() {}
    lateinit var mVMComponent: ApplicationComponet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_contacts_main)
        mVMComponent = DaggerApplicationComponet
            .builder()
            .listContactsVMModules(listContactsVMModules)
            .build()

        viewModel = listContactsVMModules.provideListContactVm("ISSO WORKING")
        Log.d("xrl8", viewModel.printa())
        Log.i("xrl8", viewModel.printa())

    }
}
