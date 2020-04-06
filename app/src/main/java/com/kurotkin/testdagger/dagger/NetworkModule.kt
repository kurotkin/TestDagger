package com.kurotkin.testdagger.dagger

import com.kurotkin.testdagger.NetworkUtils
import dagger.Module
import dagger.Provides


@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtils(): NetworkUtils? {
        return NetworkUtils()
    }
}