package com.kurotkin.testdagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kurotkin.testdagger.dagger.App

class MainActivity : AppCompatActivity() {

    var databaseHelper: DatabaseHelper? = null
    var networkUtils: NetworkUtils? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        databaseHelper = App.component.getDatabaseHelper()
        networkUtils = App.component.getNetworkUtils()
    }
}
