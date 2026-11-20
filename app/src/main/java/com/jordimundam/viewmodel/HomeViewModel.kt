package com.jordimundam.viewmodel

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel(){

    private var _frase = ""
    val frase: String
        get() = _frase

    private var _autor = ""
    val autor: String
        get() = _autor

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        _frase=currentQuote.quote
        _autor=currentQuote.author
    }
}