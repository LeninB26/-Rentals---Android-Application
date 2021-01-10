package com.example.leninbakhara.rentals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Fiction : AppCompatActivity() {
    var text: TextView? = null
    var atext: TextView? = null
    var btext: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fiction)
        text = findViewById(R.id.clhtt)
        atext = findViewById(R.id.thirt)
        btext = findViewById(R.id.ithalst)
        text?.setOnClickListener  ({
            var click = Intent (this@Fiction, CanLoveHappen:: class.java)
            startActivity(click)})
        atext?.setOnClickListener  ({
            var click = Intent (this@Fiction, TheGirl:: class.java)
            startActivity(click)})
        btext?.setOnClickListener  ({
            var click = Intent (this@Fiction, ITooHad:: class.java)
            startActivity(click)})
    }
}
