package com.example.leninbakhara.rentals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ITooHad : AppCompatActivity() {
    var text: Button? = null
    var wish: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_itoo_had)
        text = findViewById(R.id.rent)
        wish = findViewById(R.id.wish)
        text?.setOnClickListener({
            var click = Intent (this@ITooHad, UserDetails:: class.java)
            startActivity(click)
        })
        wish?.setOnClickListener({
            Toast.makeText(this, "Added to WishList", Toast.LENGTH_SHORT).show()
        })

    }
}
