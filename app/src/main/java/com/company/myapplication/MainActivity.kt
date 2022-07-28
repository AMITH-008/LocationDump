package com.company.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val file:FileHandler = FileHandler()

        var coll:ArrayList<String> = ArrayList<String>()
        coll.add("lat: , long:")
        coll.add("lat: 2, long:3")
        file.writeFile(coll, this)
    }
}