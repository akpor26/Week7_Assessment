package com.onovughe.week7assessment

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://ict-yep-backend.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: ItemService = retrofit.create(ItemService::class.java)
}