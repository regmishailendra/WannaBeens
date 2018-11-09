package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose

data class Close(
        @Expose @Column(name = "timeclose")var time: String?,
        @Expose @Column(name = "dayclose" )var day: Int)