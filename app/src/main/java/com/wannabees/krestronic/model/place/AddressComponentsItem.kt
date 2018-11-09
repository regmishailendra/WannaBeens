package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AddressComponentsItem(@Expose  @Column(name="types")var types: List<String>,
                                 @Expose @SerializedName("short_name")@Column(name="shortName")var shortName: String,
                                 @Expose @SerializedName("long_name") @Column(name="longName")var longName: String)