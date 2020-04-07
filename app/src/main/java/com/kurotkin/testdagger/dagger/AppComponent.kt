package com.kurotkin.testdagger.dagger

import com.kurotkin.testdagger.DatabaseHelper
import com.kurotkin.testdagger.MainActivity
import com.kurotkin.testdagger.NetworkUtils
import dagger.Component


@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {

//    fun getNetworkUtils(): NetworkUtils
//    fun getDatabaseHelper(): DatabaseHelper

    fun injectsMainActivity(mainActivity: MainActivity)
}