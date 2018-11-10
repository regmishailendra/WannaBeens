package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
import android.content.ClipData.Item
import android.os.AsyncTask.execute
import com.activeandroid.ActiveAndroid
import com.activeandroid.query.Select
import com.activeandroid.query.Delete
import com.google.gson.annotations.SerializedName

@Table(name = "wannabedetails")
data class WannaBeesDetail(
        @Expose @SerializedName("result") @Column(name = "innerresult") var result: Result?,
        @Expose @Column(name = "status") var status: String?) : Model() {
    constructor() : this(null, null)

        fun getDetails(): WannaBeesDetail? = Select().from(WannaBeesDetail::class.java).executeSingle()
    companion object {

        fun dropWannaBeDbTable() {
            ActiveAndroid.execSQL(String.format("DELETE FROM %s;", "wannabedetails")) } }

    fun saveAll(){
        result?.geometry?.save()
        result?.openingHours?.save()
        result?.geometry?.saveAll()

        for(p:PeriodsItem in result?.openingHours?.periods!!)
        {
        p.saveAll()}
//            result?.openingHours?.periods.save()
        result?.saveAll()
        save()
    }

}
