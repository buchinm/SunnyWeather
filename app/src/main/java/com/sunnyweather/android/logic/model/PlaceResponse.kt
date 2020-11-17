package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)
//城市名、位置，用@SerializedName注解方式建立JSON字段与Kotlin之间的映射关系
data class Place(val name: String, val lacation: Location,
            @SerializedName("formatted_address") val adress: String) {

}
//经纬度
data class Location (val lng: String, val lat: String)