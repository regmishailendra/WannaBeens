package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Table(name = "Result")
data class Result(
        @Expose @SerializedName("formatted_address") @Column(name = "fadd") var formattedAddress: String?,
        @Expose @SerializedName("website") @Column(name = "website") var website: String?,
        @Expose @Column(name = "name") var name: String?,
        @Expose @SerializedName("opening_hours") @Column(name = "openHrz") var openingHours: OpeningHours?,
        @Expose @Column(name = "geometry") var geometry: Geometry?,
        @Expose @SerializedName("address_components") @Column(name = "addComp") var addressComponents: List<AddressComponentsItem>?,
        @Expose @SerializedName("formatted_phone_number") @Column(name = "formatPhone") var formattedPhoneNumber: String?
):Model(){
    constructor():this(null,null,null,null,null,null,null)



    fun saveAll(){
      openingHours?.saveAll()
        save()
    }


}
