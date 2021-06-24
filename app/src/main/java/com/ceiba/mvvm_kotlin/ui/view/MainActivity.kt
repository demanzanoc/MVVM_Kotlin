package com.ceiba.mvvm_kotlin.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.ceiba.mvvm_kotlin.databinding.ActivityMainBinding
import com.ceiba.mvvm_kotlin.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, Observer {
            binding.textViewQuote.text = it?.quote
            binding.textViewAuthor.text = it?.author
        })

        quoteViewModel.isLoading.observe(this, Observer {
            binding.progressCircular.isVisible = it
        })

        binding.quoteLayout.setOnClickListener { quoteViewModel.randomQuote() }

    }
}
