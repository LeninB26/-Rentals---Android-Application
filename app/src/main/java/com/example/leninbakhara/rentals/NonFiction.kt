package com.example.leninbakhara.rentals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NonFiction : AppCompatActivity() {
    var text: TextView? = null
    var atext: TextView? = null
    var btext: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_non_fiction)
        text = findViewById(R.id.hst)
        atext = findViewById(R.id.subtlet)
        btext = findViewById(R.id.theoryt)
        text?.setOnClickListener  ({
            var click = Intent (this@NonFiction, HomoSapiens:: class.java)
            startActivity(click)})
        atext?.setOnClickListener  ({
            var click = Intent (this@NonFiction, SubtleArt:: class.java)
            startActivity(click)})
        btext?.setOnClickListener  ({
            var click = Intent (this@NonFiction, TheoryOfEverything:: class.java)
            startActivity(click)})
    }
}
