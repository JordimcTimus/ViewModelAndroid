package com.jordimundam.viewmodel

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel(){

    private var _frase = ""
    val frase: String
        get() = _frase

    private var _autor = ""
    val autor: String
        get() = _autor

    private var _nom = ""
    val nom: String
        get() = _nom

    private var _edat = ""
    val edat: String
        get() = _edat

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        _frase=currentQuote.quote
        _autor=currentQuote.author
    }

    fun randomAlum() {
        val currentAlum = AlumProvider.random()
        _nom=currentAlum.nom
        _edat=currentAlum.edat
    }
}