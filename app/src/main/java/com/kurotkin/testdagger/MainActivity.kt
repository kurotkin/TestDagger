package com.kurotkin.testdagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kurotkin.testdagger.dagger.App
import com.kurotkin.testdagger.dagger.annotation.DatabaseProd
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @field:Named("prod")
    @Inject
    //@DatabaseProd
    lateinit var databaseHelper: DatabaseHelper

    @Inject
    lateinit var networkUtils: NetworkUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        databaseHelper = App.component.getDatabaseHelper()
//        networkUtils = App.component.getNetworkUtils()
        App.component.injectsMainActivity(this)
        textView.text = databaseHelper.getString()
    }
}
