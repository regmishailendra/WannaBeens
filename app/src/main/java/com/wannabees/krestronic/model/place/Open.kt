package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose

data class Open (
        @Expose @Column(name="time") var time: String?,
        @Expose @Column(name="day") var day: Int)
