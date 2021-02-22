package com.outrowender.horizoncompanion.ui.tracks

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TracksViewModel : ViewModel() {

    private var _tracks = ArrayList<String>()

    fun fillTracks(){
        _tracks = arrayListOf("aaa", "aa2", "eberhard4")
    }

    fun getAllTracks(): ArrayList<String>? {
        return _tracks
    }

    fun searchTracks(q: String): List<String>? {
        return _tracks?.filter { s: String -> s.contains(q) }
    }
}