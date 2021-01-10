package com.example.leninbakhara.rentals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Thanks : AppCompatActivity() {
    var home: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)
        home = findViewById(R.id.home)
        home?.setOnClickListener({
            var click = Intent (this@Thanks, MainActivity:: class.java)
            startActivity(click)
        })

    }
}
