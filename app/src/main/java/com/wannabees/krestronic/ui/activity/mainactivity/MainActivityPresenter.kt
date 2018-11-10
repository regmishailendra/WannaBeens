package com.wannabees.krestronic.ui.activity.mainactivity

import android.view.View
import com.wannabees.krestronic.adapter.HomePagerAdapter
import com.wannabees.krestronic.model.FragmentTabData

/**
 * Created by shailendra on 11/10/18.
 */

class MainActivityPresenter(var view: MainActivity){
    fun setupViewPager(){
        val adapter= HomePagerAdapter(view.supportFragmentManager)
        adapter.addFragment(true,"")
        adapter.addFragment(false,"")
        view.setupViewPager(adapter)
    }








}