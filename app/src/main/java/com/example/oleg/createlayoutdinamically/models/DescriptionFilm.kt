package com.example.oleg.createlayoutdinamically.models

import com.google.gson.annotations.SerializedName

data class DescriptionFilm (
        @SerializedName("release_year") val year:String?,
        @SerializedName("rating") val raiting:String?,
        @SerializedName("summary") val summary:String?,
        @SerializedName("show_title") val title:String?,
        @SerializedName("category") val category:String?,
        @SerializedName("director") val director:String?,
        @SerializedName("poster") val picture:String?,
        @SerializedName("show_cast") val actors:String?,
        @SerializedName("runtime") val runtime:String?
){

}