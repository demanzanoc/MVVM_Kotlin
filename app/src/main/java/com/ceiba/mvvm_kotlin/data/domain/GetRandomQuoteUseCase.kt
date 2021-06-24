package com.ceiba.mvvm_kotlin.data.domain

import com.ceiba.mvvm_kotlin.data.model.QuoteModel
import com.ceiba.mvvm_kotlin.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel ? {
        val quotes = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}