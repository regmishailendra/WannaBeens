@file:JvmName("MetaDataHelper")
@file:JvmMultifileClass

package com.wannabees.krestronic.helpers

/**
 * Created by shailendra on 11/9/18.
 */

val PLACE_BASE_URL = "https://api.myjson.com"

//val PLACE_BASE_URL = "https://maps.googleapis.com"

val PLACES_API_KEY = "AIzaSyC1-HMMMh9OF_dfFRvFOaRbk9D030Yk__U"
val PLACES_Wannabees_ID = "ChIJadCegxiqEmsRtLLcBnSv130"
val PLACES_API_FIELDS = "name,formatted_address,address_components,formatted_address,opening_hours,website,geometry,formatted_phone_number"
val PLACES_API_DETAIL_URL = "placeid=+$PLACES_Wannabees_ID&fields=$PLACES_API_FIELDS&key=$PLACES_API_KEY"
