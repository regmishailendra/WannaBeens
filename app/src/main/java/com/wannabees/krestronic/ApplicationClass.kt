package com.wannabees.krestronic

import android.app.Application
import com.activeandroid.ActiveAndroid
import com.wannabees.krestronic.dependency.DaggerRetrofitComponent
import com.wannabees.krestronic.dependency.RetrofitComponent
import com.wannabees.krestronic.dependency.RetrofitModule

/**
 * Created by shailendra on 11/9/18.
 */
class ApplicationClass: Application() {

    lateinit var retrofitComponent:RetrofitComponent

    override fun onCreate() {
        super.onCreate()
        ActiveAndroid.initialize(this)
        retrofitComponent=DaggerRetrofitComponent.builder().retrofitModule(RetrofitModule(com.wannabees.krestronic.helpers.PLACE_BASE_URL)).build()

    }

    fun  getComponent():RetrofitComponent=retrofitComponent




}