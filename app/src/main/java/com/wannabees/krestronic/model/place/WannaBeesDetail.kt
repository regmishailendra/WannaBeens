package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose

data class WannaBeesDetail (
        @Expose   @Column(name="result") var result: Result?,
        @Expose @Column(name = "status")var status: String?): Model()