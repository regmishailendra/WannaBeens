package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
@Table(name = "close")
data class Close(
        @Expose @Column(name = "timeclose")var time: String?,
        @Expose @Column(name = "dayclose" )var day: Int?): Model(){
    constructor():this(null,null)

}