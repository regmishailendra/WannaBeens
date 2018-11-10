package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
@Table(name = "ne")
data class Northeast(
        @Expose @Column(name="long") var lng: Double = 0.toDouble(),
        @Expose @Column(name="latt") var lat: Double = 0.toDouble()): Model()