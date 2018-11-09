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

//    interface GetPlaceDetail{
//        @GET("/maps/api/place/details/json")
//       fun getWannaBeDetails(
//                @Query("placeid")  placeId:String,
//                @Query("fields")  fields:String,
//                @Query("key")  key:String
//        ): Call<WannaBeesDetail>
//    }



}



