package com.example.retrofit_31_shafiq.api

import com.example.retrofit_31_shafiq.model.IndonesiaResponse
import com.example.retrofit_31_shafiq.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api{
    @GET("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}