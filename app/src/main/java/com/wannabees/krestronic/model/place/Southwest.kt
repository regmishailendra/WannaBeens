package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose

data class Southwest (
        @Expose @Column(name="southeastlat") var lng: Double = 0.toDouble(),
        @Expose @Column(name="southwestlong")  var lat: Double = 0.toDouble()

)