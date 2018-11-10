package com.wannabees.krestronic.server

import com.wannabees.krestronic.model.place.WannaBeesDetail
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by shailendra on 11/9/18.
 */
interface RetrofitInterface{

    interface GetPlaceDetail{
        @GET("/bins/1by8ee")
       fun getWannaBeDetails(): Call<WannaBeesDetail>
    }


    /**  Due to the unavailability of credit card in Nepal I could only get few APIs quata
     * and this below method works perfectly for places API if valid API key is kept. Else the
     * above method gives same response as below. Uncomment it.
     * if you want to try with places API with your API key
     *   1) Uncomment the below code
     *   2) Goto MetaDataHelper file and uncomment the google's base url
     *   3) Use 26th line in DetailsFragmentPresenter file rather  then 25th one (which is basically
     *      calling the above method)*/



//    interface GetPlaceDetail{
//        @GET("/maps/api/place/details/json")
//       fun getWannaBeDetails(
//                @Query("placeid")  placeId:String,
//                @Query("fields")  fields:String,
//                @Query("key")  key:String
//        ): Call<WannaBeesDetail>
//    }



}



