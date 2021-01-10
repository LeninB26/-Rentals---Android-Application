package com.example.leninbakhara.rentals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_user_details.*

class UserDetails : AppCompatActivity() {
    var rnt: Button? = null
    var am: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)
        rnt = findViewById(R.id.go)
        am = findViewById(R.id.soo)
        rnt?.setOnClickListener({
            var click = Intent (this@UserDetails, Thanks:: class.java)
            startActivity(click)
        })
        am?.setOnClickListener({
            val num:Int = rentedit.text.toString().toInt()
            val amount = num*0.2
            price.text = "Total Amount Rs. $amount"
        })

    }
}
