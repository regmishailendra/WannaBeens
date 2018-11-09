package com.wannabees.krestronic.ui.fragment
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.wannabees.krestronic.ApplicationClass
import com.wannabees.krestronic.R
import com.wannabees.krestronic.model.place.WannaBeesDetail
import com.wannabees.krestronic.server.RetrofitInterface
import kotlinx.android.synthetic.main.fragment_details.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

/**
 * Created by shailendra on 11/9/18.
 */

class DetailsFragment : Fragment() {
    @Inject lateinit var retrofit:Retrofit
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //
        return inflater.inflate(R.layout.fragment_details,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity?.application as ApplicationClass).retrofitComponent.inject(this)
        val creator: RetrofitInterface.GetPlaceDetail? = retrofit.create(RetrofitInterface.GetPlaceDetail::class.java)
        val caller =creator?.getWannaBeDetails()
//        val caller =creator?.getWannaBeDetails(com.wannabees.krestronic.helpers.PLACES_Wannabees_ID,com.wannabees.krestronic.helpers.PLACES_API_FIELDS,com.wannabees.krestronic.helpers.PLACES_API_KEY)
        caller?.enqueue(object :Callback<WannaBeesDetail>{
            override fun onResponse(call: Call<WannaBeesDetail>?, response: Response<WannaBeesDetail>?) {

                if (response?.isSuccessful!!){
                    tv.setText(response.body().toString()) }
                else{
                    tv.setText(response.errorBody().toString()) }
            }
            override fun onFailure(call: Call<WannaBeesDetail>?, t: Throwable?) {
                tv.setText(t?.localizedMessage+"") } })
    }
}