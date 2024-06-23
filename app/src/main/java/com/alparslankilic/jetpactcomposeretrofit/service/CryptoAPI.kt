package com.alparslankilic.jetpactcomposeretrofit.service

import com.alparslankilic.jetpactcomposeretrofit.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {
    @GET("ibrahimgokyar/androidkitap/master/crypto.json")
    fun getData(): Call<List<CryptoModel>>
}