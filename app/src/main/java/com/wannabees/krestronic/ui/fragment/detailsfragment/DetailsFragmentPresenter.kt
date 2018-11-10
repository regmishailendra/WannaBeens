package com.wannabees.krestronic.ui.fragment.detailsfragment

import com.wannabees.krestronic.ApplicationClass
import com.wannabees.krestronic.adapter.DetailsRecyclerAdapter
import com.wannabees.krestronic.model.place.WannaBeesDetail
import com.wannabees.krestronic.server.RetrofitInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * Created by shailendra on 11/10/18.
 */
class DetailsFragmentPresenter(var view: DetailsFragment) {
    @Inject lateinit var retrofit: Retrofit
init {
    (view.activity?.application as ApplicationClass).retrofitComponent.inject(this)
}

    fun getData(){
        val creator: RetrofitInterface.GetPlaceDetail? = retrofit.create(RetrofitInterface.GetPlaceDetail::class.java)
        val caller =creator?.getWannaBeDetails()
//        val caller =creator?.getWannaBeDetails(com.wannabees.krestronic.helpers.PLACES_Wannabees_ID,com.wannabees.krestronic.helpers.PLACES_API_FIELDS,com.wannabees.krestronic.helpers.PLACES_API_KEY)
        caller?.enqueue(object : Callback<WannaBeesDetail> {
            override fun onResponse(call: Call<WannaBeesDetail>?, response: Response<WannaBeesDetail>?) {
                if (response?.isSuccessful!!){
                   populateUi(response)
                }
                else{
                }
            }
            override fun onFailure(call: Call<WannaBeesDetail>?, t: Throwable?) {
            } })
    }

    private fun populateUi(response: Response<WannaBeesDetail>) {
        view.populateRecyclerView(response.body(),getAdapter(response.body()))
        saveToDb(response.body())
        view.showCurrentStatus(response.body()?.result?.openingHours?.isOpenNow!!)
    }


    private fun saveToDb(details: WannaBeesDetail?) {
        WannaBeesDetail.dropWannaBeDbTable()
        details?.saveAll()
    }


    private fun getAdapter(details: WannaBeesDetail?):DetailsRecyclerAdapter{
        return DetailsRecyclerAdapter(details?.result?.openingHours?.weekdayText)

    }




}