package com.example.databinding_android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel()
{
    /* When you are using an immutable live data to access the values of mutable live data then you mark its object as private */
    private val funFactsObject = MutableLiveData(Quote("Save the Strays!!!" , "Raj Kanchan"))
    val funFacts : LiveData<Quote>
        get() = funFactsObject

    fun updateQuote()
    {
        funFactsObject.value = Quote("Harry Potter and the Goblet of Fire" , "J.K.Rowling")
    }

}