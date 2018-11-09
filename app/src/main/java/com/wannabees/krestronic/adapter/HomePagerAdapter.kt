package com.wannabees.krestronic.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by shailendra on 11/9/18.
 */
class HomePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    var mFragments: ArrayList<Fragment> = ArrayList<Fragment>()
    var mFragmentTitle: ArrayList<String> = ArrayList<String>()


    override fun getItem(position: Int): Fragment {
         return      mFragments.get(position)
    }

    override fun getCount(): Int {
          return mFragments.size
    }

    fun addFragment(fragment: Fragment, tabTitle: String) {
        mFragments.add(fragment)
        mFragmentTitle.add(tabTitle)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitle.get(position)

    }



}


