package com.kurotkin.testdagger.dagger

import com.kurotkin.testdagger.HttpClient
import com.kurotkin.testdagger.NetworkUtils
import dagger.Module
import dagger.Provides


@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtils(httpClient: HttpClient): NetworkUtils {
        return NetworkUtils(httpClient)
    }

    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }
}