package com.kurotkin.testdagger.dagger

import com.kurotkin.testdagger.DatabaseHelper
import com.kurotkin.testdagger.dagger.annotation.DatabaseProd
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class StorageModule {

    //@Named("prod")
    //@DatabaseProd
    @Provides
    fun provideDatabaseHelper(): DatabaseHelper {
        return DatabaseHelper("DatabaseHelper")
    }

    //@Named("test")
//    @Provides
//    fun provideDatabaseHelperTest(): DatabaseHelper {
//        return DatabaseHelper("test")
//    }
}