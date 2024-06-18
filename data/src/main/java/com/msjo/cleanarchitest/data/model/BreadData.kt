package com.msjo.cleanarchitest.data.model

import com.google.gson.annotations.SerializedName
import com.msjo.cleanarchitest.domain.entity.BreadEntity

data class BreadData(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("brand") val brand: String,
    @SerializedName("date") val date: String,
    @SerializedName("image") val image: String
)

/**
 * <pre>
 * 설명 : 네트워크를 통해 받아온 Original 데이터를 원하는 도메인 형식의 데이터로 변환하는 Extension 함수
 *
 * </pre>
 * <p>
 *
 * 2024. 05.. msjo
 */
fun BreadData.toDomain() = BreadEntity(
    id = id,
    name = name,
    brand = brand,
    date = date,
    image = image
)