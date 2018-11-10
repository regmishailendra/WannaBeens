package com.wannabees.krestronic.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.wannabees.krestronic.ui.fragment.detailsfragment.DetailsFragment
import com.wannabees.krestronic.ui.fragment.homefragment.HomeFragment

/**
 * Created by shailendra on 11/9/18.
 */
class HomePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    var mFragments: ArrayList<Fragment> = ArrayList<Fragment>()
    var mFragmentTitle: ArrayList<String> = ArrayList<String>()


    override fun getItem(position: Int): Fragment {
         return mFragments.get(position)
    }

    override fun getCount(): Int {
          return mFragments.size
    }

    fun addFragment(isHome: Boolean, tabTitle: String) {
       if(isHome) mFragments.add(HomeFragment()) else mFragments.add(DetailsFragment())
        mFragmentTitle.add(tabTitle)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitle.get(position)

    }



}


