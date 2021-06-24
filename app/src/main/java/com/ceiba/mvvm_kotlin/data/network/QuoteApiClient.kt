package com.ceiba.mvvm_kotlin.data.network

import com.ceiba.mvvm_kotlin.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}
