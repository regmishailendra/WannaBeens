package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class OpeningHours (
        @Expose @Column(name="isOpenNow")  var isOpenNow: Boolean,
        @Expose @Column(name="periods")   var periods: List<PeriodsItem>?,
        @Expose @SerializedName("weekday_text") @Column(name="weekday")  var weekdayText: List<String>?)