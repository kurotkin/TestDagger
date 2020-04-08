package com.kurotkin.testdagger.dagger

import com.kurotkin.testdagger.DatabaseHelper
import com.kurotkin.testdagger.dagger.annotation.DatabaseProd
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class StorageModule {

    @Named("prod")
    //@DatabaseProd
    @Provides
    fun provideDatabaseHelperProd(): DatabaseHelper {
        return DatabaseHelper("prod")
    }

    @Named("test")
    @Provides
    fun provideDatabaseHelperTest(): DatabaseHelper {
        return DatabaseHelper("test")
    }
}