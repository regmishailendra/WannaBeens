package com.wannabees.krestronic.dependency

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.wannabees.krestronic.ApplicationClass
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by shailendra on 11/9/18.
 */
@Module class RetrofitModule(baseUrl:String) {
    private var baseUrl: String

    init {
        this.baseUrl=baseUrl
    }
    @Singleton @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create
            (GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()))
            .build()
}