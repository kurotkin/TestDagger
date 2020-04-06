package com.kurotkin.testdagger.dagger

import com.kurotkin.testdagger.DatabaseHelper
import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDatabaseHelper(): DatabaseHelper? {
        return DatabaseHelper()
    }
}