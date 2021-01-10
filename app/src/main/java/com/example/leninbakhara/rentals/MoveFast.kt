package com.example.leninbakhara.rentals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MoveFast : AppCompatActivity() {
    var text: Button? = null
    var wish: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_fast)
        text = findViewById(R.id.rent)
        wish = findViewById(R.id.wish)
        text?.setOnClickListener({
            var click = Intent (this@MoveFast, UserDetails:: class.java)
            startActivity(click)
        })
        wish?.setOnClickListener({
            Toast.makeText(this, "Added to WishList", Toast.LENGTH_SHORT).show()
        })

    }
}
