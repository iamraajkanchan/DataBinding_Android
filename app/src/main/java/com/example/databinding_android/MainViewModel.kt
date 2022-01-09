package com.example.databinding_android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel()
{
    private val quotesObject = MutableLiveData(Quote("Life of Stray!" , "Raj Kanchan"))
    val quotesLive : LiveData<Quote>
        get() = quotesObject
    private val releasingObject = MutableLiveData("24th December 2002")
    val releasing : LiveData<String>
        get() = releasingObject

    fun getQuotes()
    {
        quotesObject.value = Quote("Harry Potter and the Goblet of Fire" , "J.K. Rowling")
    }

    fun getReleasingData()
    {
        releasingObject.value = "25th December 2002"
    }
}