package com.wannabees.krestronic.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wannabees.krestronic.R
import com.wannabees.krestronic.adapter.HomeRecyclerAdapter
import com.wannabees.krestronic.model.CompanyInfo
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by shailendra on 11/9/18.
 */

class HomeFragment : Fragment() {
    var companyInfoList:ArrayList<CompanyInfo> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        companyInfoList.add(CompanyInfo(R.drawable.ic_location, "Au"))
        companyInfoList.add(CompanyInfo(R.drawable.ic_phone, "98554850"))
        companyInfoList.add(CompanyInfo(R.drawable.ic_url, "www.au.com"))
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        rv.layoutManager= LinearLayoutManager(activity)
        rv.adapter= HomeRecyclerAdapter(companyInfoList)
    }



}