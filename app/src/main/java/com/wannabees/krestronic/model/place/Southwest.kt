package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
@Table(name = "sw")
data class Southwest (
        @Expose @Column(name="swlat") var lng: Double = 0.toDouble(),
        @Expose @Column(name="swln")  var lat: Double = 0.toDouble()

): Model()