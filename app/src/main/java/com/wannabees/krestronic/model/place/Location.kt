package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose

data class Location (
        @Expose @Column(name="lng") var lng: Double = 0.toDouble(),
        @Expose @Column(name="lat") var lat: Double = 0.toDouble())