package com.outrowender.horizoncompanion.ui.tracks

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.outrowender.horizoncompanion.R


class TracksActivity : AppCompatActivity() {

    private lateinit var _list: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracks)

        _list = findViewById(R.id.listViewTracks)

        //create ArrayList of String
        val arrayList: ArrayList<String> = ArrayList()

        //Add elements to arraylist
        arrayList.add("android")
        arrayList.add("is")
        arrayList.add("great")
        arrayList.add("and I love it")
        arrayList.add("It")
        arrayList.add("is")
        arrayList.add("better")
        arrayList.add("then")
        arrayList.add("many")
        arrayList.add("other")
        arrayList.add("operating system.")

        //Create Adapter
        //Create Adapter
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList)

        //assign adapter to listview
        _list.adapter = arrayAdapter
    }
}