package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
@Table(name = "op")
data class Open (
        @Expose @Column(name="time") var time: String?,
        @Expose @Column(name="day") var day: Int): Model(){
    constructor():this(null,0)
}
