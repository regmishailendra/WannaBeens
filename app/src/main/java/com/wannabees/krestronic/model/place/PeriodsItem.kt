package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose

data class PeriodsItem(
        @Expose @Column(name="close") var close: Close?,
        @Expose @Column(name="open")  var open: Open?)
