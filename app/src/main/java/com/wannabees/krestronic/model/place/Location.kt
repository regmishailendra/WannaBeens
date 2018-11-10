package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
@Table(name = "loc")
data class Location (
        @Expose @Column(name="lng") var lng: Double? = 0.toDouble(),
        @Expose @Column(name="lat") var lat: Double? = 0.toDouble()): Model(){
    constructor():this(null,null)
}