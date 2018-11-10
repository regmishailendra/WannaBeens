package com.wannabees.krestronic.ui

import com.wannabees.krestronic.adapter.DetailsRecyclerAdapter
import com.wannabees.krestronic.adapter.HomePagerAdapter
import com.wannabees.krestronic.model.CompanyInfo
import com.wannabees.krestronic.model.FragmentTabData
import com.wannabees.krestronic.model.place.WannaBeesDetail

/**
 * Created by shailendra on 11/10/18.
 */
interface MyInterface{
    interface MainActivityView{
         fun setupViewPager(adapter:HomePagerAdapter)
  }

    interface DetailsFragmentView{
        fun populateRecyclerView(details: WannaBeesDetail?, adapter: DetailsRecyclerAdapter)
        fun showCurrentStatus(status:Boolean)
    }


    interface HomeFragmentView{
        fun initialDataSetup(companyInfoList:ArrayList<CompanyInfo>)
    }


}