package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
@Table(name = "vp")
data class Viewport (
        @Expose @Column(name="sw")  var southwest: Southwest?,
        @Expose @Column(name="ne")  var northeast: Northeast?
): Model(){
    constructor():this(null,null)


    fun saveAll() {
        southwest?.save()
        northeast?.save()
        save()
    }
}
