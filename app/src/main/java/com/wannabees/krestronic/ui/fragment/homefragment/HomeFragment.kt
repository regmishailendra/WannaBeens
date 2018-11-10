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
import com.wannabees.krestronic.model.place.WannaBeesDetail
import com.wannabees.krestronic.ui.MyInterface
import kotlinx.android.synthetic.main.fragment_home.*
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import com.wannabees.krestronic.listeners.DataFetchListener
import com.wannabees.krestronic.listeners.DataPassListener
import com.wannabees.krestronic.ui.activity.mainactivity.MainActivity
import com.wannabees.krestronic.ui.fragment.BaseFragment
import java.util.*


/**
 * Created by shailendra on 11/9/18.
 */

class HomeFragment : BaseFragment(),MyInterface.HomeFragmentView,View.OnClickListener,DataPassListener{


    lateinit var presenter:HomeFragmentPresenter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       presenter= HomeFragmentPresenter(this)
        (activity as MainActivity).setListenerForHome(this)
        presenter.setUpRecyclerView()
        setActions()
    }


    override fun initialDataSetup(companyInfoList:ArrayList<CompanyInfo>) {
        rv.layoutManager= LinearLayoutManager(activity)
        rv.adapter= HomeRecyclerAdapter(companyInfoList)
        hideProgressBar()
    }

    private fun setActions() {
           lin_map.setOnClickListener(this)
           lin_call.setOnClickListener(this)
           lin_about.setOnClickListener(this)
    }

    override fun onDataPassed() {
            presenter.setUpRecyclerView()
    }


    override fun refreshRecyclerView(){
        rv.adapter?.notifyDataSetChanged()
    }


    override fun onClick(v: View?) {
        val result=WannaBeesDetail().getDetails()?.result
           when(v?.id){
               R.id.lin_map->{
                   var location = result?.geometry?.location
                   val uri = String.format(Locale.ENGLISH, "geo:%f,%f", location?.lat, location?.lng)
                   val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                   context?.startActivity(intent)}

               R.id.lin_call->{
                   val intent = Intent(Intent.ACTION_DIAL)
                   intent.data = Uri.parse("tel:${result?.formattedPhoneNumber}")
                   startActivity(intent) }

               R.id.lin_about->{
                   val browserIntent = Intent(Intent.ACTION_VIEW,Uri.parse(result?.website))
                   startActivity(browserIntent) }
           }
    }



}

