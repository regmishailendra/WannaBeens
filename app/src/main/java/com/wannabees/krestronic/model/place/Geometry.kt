package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose

data class Geometry(
        @Expose @Column(name="vp") var viewport: Viewport?,
        @Expose @Column(name="location") var location: Location?)
