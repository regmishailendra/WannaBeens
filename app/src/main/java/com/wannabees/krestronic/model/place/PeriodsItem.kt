package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose

@Table(name = "pi")
data class PeriodsItem(
        @Expose @Column(name = "close") var close: Close?,
        @Expose @Column(name = "open") var open: Open?) : Model() {
    constructor() : this(null, null)


    fun saveAll(){
        close?.save()
        open?.save()
        save()
    }


}