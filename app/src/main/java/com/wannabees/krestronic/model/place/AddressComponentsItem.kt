package com.wannabees.krestronic.model.place

import com.activeandroid.Model
import com.activeandroid.annotation.Column
import com.activeandroid.annotation.Table
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
@Table(name = "addresscomp")
data class AddressComponentsItem(@Expose  @Column(name="types")var types: List<String>?,
                                 @Expose @SerializedName("short_name")@Column(name="shortName")var shortName: String?,
                                 @Expose @SerializedName("long_name") @Column(name="longName")var longName: String?):Model(){
    constructor():this(null,null,null)

}