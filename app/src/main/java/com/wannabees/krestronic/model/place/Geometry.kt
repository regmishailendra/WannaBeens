package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
@Table(name = "geo")
data class Geometry(
        @Expose @Column(name="vp") var viewport: Viewport?,
        @Expose @Column(name="location") var location: Location?): Model(){
    constructor():this(null,null)

    fun saveAll() {
        viewport?.saveAll()
        location?.save()
       save()
    }

}
