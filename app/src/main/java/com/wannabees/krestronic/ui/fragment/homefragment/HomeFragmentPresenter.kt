package com.wannabees.krestronic.ui.fragment.homefragment

import android.os.Handler
import android.util.Log
import com.wannabees.krestronic.R
import com.wannabees.krestronic.model.CompanyInfo
import com.wannabees.krestronic.model.place.Result
import com.wannabees.krestronic.model.place.WannaBeesDetail

/**
 * Created by shailendra on 11/10/18.
 */
class HomeFragmentPresenter(var view: HomeFragment) {
    var companyInfoList: ArrayList<CompanyInfo> = ArrayList()
    fun setUpRecyclerView(){
          var placeDetail: Result? = WannaBeesDetail().getDetails()?.result
        if(placeDetail!=null){
            Log.v("letscheck","m here")
            companyInfoList.clear()
          companyInfoList.add(CompanyInfo(R.drawable.ic_location, placeDetail?.formattedAddress!!))
          companyInfoList.add(CompanyInfo(R.drawable.ic_phone, placeDetail.formattedPhoneNumber!!))
          companyInfoList.add(CompanyInfo(R.drawable.ic_url, placeDetail.website!!))
          view.initialDataSetup(companyInfoList)
         view.refreshRecyclerView()
      }
    }
}