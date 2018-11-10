package com.wannabees.krestronic.adapter

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.wannabees.krestronic.R

/**
 * Created by shailendra on 11/9/18.
 */
class DetailsRecyclerAdapter(details: ArrayList<String>?) : RecyclerView.Adapter<DetailsRecyclerAdapter.MyViewHolder>() {
    var details: ArrayList<String>?
    lateinit var context: Context
    init { this.details = details }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
         this.context=parent.context
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.row_openings, parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val today=details?.get(position)?.split(":",limit = 2)
        holder.tvDay.setText(today?.get(0)?.trim())
        holder.tvTime.setText(today?.get(1)?.trim())
        coloredText(today?.get(0)!!.trim(),holder.tvDay)


    }

    private fun coloredText(day: String, tv:TextView) {
        if(TextUtils.equals(day,context.getString(R.string.sunday_text)) || TextUtils.equals(day,context.getString(R.string.saturday_text)) ) {
            tv.setTextColor(Color.RED)
        }
    }

    override fun getItemCount() = details!!.size

    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
           var tvDay: TextView =v.findViewById(R.id.tv_day)
           var tvTime: TextView =v.findViewById(R.id.tv_time)
    }
}