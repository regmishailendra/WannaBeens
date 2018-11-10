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
    interface ProgressBar{
        fun hideProgressBar()
        fun showProgressBar()
    }


    interface MainActivityView{
         fun setupViewPager(adapter:HomePagerAdapter)
  }

    interface DetailsFragmentView:ProgressBar{
        fun populateRecyclerView(details: WannaBeesDetail?, adapter: DetailsRecyclerAdapter)
        fun showCurrentStatus(status:Boolean)
        fun setErrorMessage(message:String)

    }


    interface HomeFragmentView:ProgressBar{
        fun initialDataSetup(companyInfoList:ArrayList<CompanyInfo>)
        fun refreshRecyclerView()
    }








}