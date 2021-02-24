package com.outrowender.horizoncompanion.ui.tracks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TracksViewModel : ViewModel() {

    private var _tracks = ArrayList<String>()
    private var _searchResults = MutableLiveData<List<String>>()

    val allTracks: ArrayList<String>
        get() = _tracks

    val searchResults: LiveData<List<String>>
        get() = _searchResults

    init {
        _tracks = arrayListOf("First value", "Second value", "Third value", "Fourth value", "Fifth value")
    }

    fun search(q: String){
        var result = _tracks?.filter { s: String -> s.contains(q) }
        _searchResults.value = result
    }

    fun clearSearch(){
        _searchResults.value = arrayListOf()
    }
}