package com.ceiba.mvvm_kotlin.data.domain

import com.ceiba.mvvm_kotlin.data.QuoteRepository
import com.ceiba.mvvm_kotlin.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()
    suspend operator fun invoke(): List<QuoteModel> = repository.getAllQuotes()
}
