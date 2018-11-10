package com.wannabees.krestronic.ui.fragment.homefragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wannabees.krestronic.R
import com.wannabees.krestronic.adapter.HomeRecyclerAdapter
import com.wannabees.krestronic.model.CompanyInfo
import com.wannabees.krestronic.model.place.Result
import com.wannabees.krestronic.model.place.WannaBeesDetail
import com.wannabees.krestronic.ui.MyInterface
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by shailendra on 11/9/18.
 */

//Log.v("dbcheckingWebsite",""+WannaBeesDetail.getDetails().result?.website)
//Log.v("dbcheckingFormattedPh",""+WannaBeesDetail.getDetails().result?.formattedPhoneNumber)
//Log.v("dbcheckingFormattedadd",""+WannaBeesDetail.getDetails().result?.formattedAddress)
//Log.v("dbcheckingLocation",""+WannaBeesDetail.getDetails().result?.geometry?.location)




class HomeFragment : Fragment(),MyInterface.HomeFragmentView{
      lateinit var presenter:HomeFragmentPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       presenter= HomeFragmentPresenter(this)
        presenter.setUpRecyclerView()
    }



    override fun initialDataSetup(companyInfoList:ArrayList<CompanyInfo>) {
        rv.layoutManager= LinearLayoutManager(activity)
        rv.adapter= HomeRecyclerAdapter(companyInfoList)
    }






    }

