package com.wannabees.krestronic.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.wannabees.krestronic.R
import com.wannabees.krestronic.model.CompanyInfo

/**
 * Created by shailendra on 11/9/18.
 */
class HomeRecyclerAdapter(infoList: List<CompanyInfo>) : RecyclerView.Adapter<HomeRecyclerAdapter.MyViewHolder>() {
    var infoList: List<CompanyInfo> = ArrayList()
    init { this.infoList = infoList }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate( R.layout.row_info, parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.iv.setImageResource(infoList.get(position).icon)
        holder.tv.setText(infoList.get(position).info)
    }

    override fun getItemCount() = infoList.size

    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
           var iv:ImageView=v.findViewById(R.id.iv)
           var tv:TextView=v.findViewById(R.id.tv)
    }
}