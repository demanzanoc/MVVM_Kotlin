package com.ceiba.mvvm_kotlin.data

import com.ceiba.mvvm_kotlin.data.model.QuoteModel
import com.ceiba.mvvm_kotlin.data.model.QuoteProvider
import com.ceiba.mvvm_kotlin.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}
