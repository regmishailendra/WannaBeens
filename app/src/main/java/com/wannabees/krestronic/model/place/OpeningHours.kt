package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
@Table(name = "ohrs")
data class OpeningHours (
        @Expose @SerializedName("open_now") @Column(name="isOpenNow")  var isOpenNow: Boolean,
        @Expose @Column(name="periods")   var periods: ArrayList<PeriodsItem>?,
        @Expose @SerializedName("weekday_text") @Column(name="weekday")  var weekdayText: ArrayList<String>?): Model()
{    constructor():this(false,null,null)


    fun saveAll(){
        for(pi:PeriodsItem in periods!!){
            pi.saveAll()

        }

        save()

    }


}