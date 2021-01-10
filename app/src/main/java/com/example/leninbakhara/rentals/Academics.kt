package com.example.leninbakhara.rentals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Academics : AppCompatActivity() {
    var text: TextView? = null
    var atext: TextView? = null
    var btext: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_academics)
        text = findViewById(R.id.mftct)
        atext = findViewById(R.id.mhtmlt)
        btext = findViewById(R.id.pythont)
        text?.setOnClickListener  ({
            var click = Intent (this@Academics, MoveFast:: class.java)
            startActivity(click)})
        atext?.setOnClickListener  ({
            var click = Intent (this@Academics, HTMLCSS:: class.java)
            startActivity(click)})
        btext?.setOnClickListener  ({
            var click = Intent (this@Academics, Python:: class.java)
            startActivity(click)})

    }
}
