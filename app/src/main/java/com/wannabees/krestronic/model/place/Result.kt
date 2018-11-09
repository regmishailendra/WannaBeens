package com.wannabees.krestronic.model.place

import com.activeandroid.annotation.Column
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Result(
        @Expose @SerializedName("formatted_address") @Column(name = "fadd") var formattedAddress: String?,
        @Expose @Column(name = "website") var website: String?,
        @Expose @Column(name = "name") var name: String?,
        @Expose @SerializedName("opening_hours") @Column(name = "openHrs") var openingHours: OpeningHours?,
        @Expose @Column(name = "geometry") var geometry: Geometry?,
        @Expose @SerializedName("address_components") @Column(name = "addComp") var addressComponents: List<AddressComponentsItem>?,
        @Expose @SerializedName("formatted_phone_number") @Column(name = "formatPhone") var formattedPhoneNumber: String?
)
