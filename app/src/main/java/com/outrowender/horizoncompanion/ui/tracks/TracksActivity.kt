package com.outrowender.horizoncompanion.ui.tracks

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.outrowender.horizoncompanion.R

class TracksActivity : AppCompatActivity() {

    private lateinit var _list: ListView
    private lateinit var _search: SearchView


    private lateinit var viewModel: TracksViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracks)

        viewModel = ViewModelProvider(this).get(TracksViewModel::class.java)

        _list = findViewById(R.id.listViewTracks)
        _search = findViewById(R.id.searchView)

        viewModel.searchResults.observe(this, Observer { tracks ->
            _list.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tracks)
        })

        _search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                viewModel.search(query)
                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                if(newText.isNullOrEmpty()) viewModel.clearSearch()
                return false
            }
        })

    }
}