package com.example.leninbakhara.rentals

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SelfHelp : AppCompatActivity() {
    var text: TextView? = null
    var atext: TextView? = null
    var btext: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_self_help)
        text = findViewById(R.id.woft)
        atext = findViewById(R.id.mmt)
        btext = findViewById(R.id.zerot)
        text?.setOnClickListener  ({
            var click = Intent (this@SelfHelp, WingsofFire:: class.java)
            startActivity(click)})
        atext?.setOnClickListener  ({
            var click = Intent (this@SelfHelp, MasteryManual:: class.java)
            startActivity(click)})
        btext?.setOnClickListener  ({
            var click = Intent (this@SelfHelp, ZeroOne:: class.java)
            startActivity(click)})

    }
}
