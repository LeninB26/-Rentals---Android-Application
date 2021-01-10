package com.example.leninbakhara.rentals

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LiveData
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    var text: TextView? = null
    var nonfiction: TextView? = null
    var aca: TextView? = null
    var self: TextView? = null
    var power: TextView? = null
    var let: TextView? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        text = view.findViewById(R.id.fiction)
        nonfiction = view.findViewById(R.id.NFiction)
        aca = view.findViewById(R.id.academics)
        self = view.findViewById(R.id.SelfHelp2)
        power = view.findViewById(R.id.pomt)
        let = view.findViewById((R.id.luct))
        text?.setOnClickListener ({
            var click = Intent(requireActivity(), Fiction :: class.java)
            startActivity(click)
        })
        nonfiction?.setOnClickListener ({
            var nclick = Intent(requireActivity(), NonFiction :: class.java)
            startActivity(nclick)
        })
        aca?.setOnClickListener ({
            var aclick = Intent(requireActivity(), Academics :: class.java)
            startActivity(aclick)
        })
        self?.setOnClickListener ({
            var sclick = Intent (requireActivity(), SelfHelp :: class.java)
            startActivity(sclick)
        })
        power?.setOnClickListener({
            var bclick = Intent (requireActivity(), PowerofMind :: class.java)
            startActivity(bclick)
        })
        let?.setOnClickListener({
            var dclick = Intent(requireActivity(), LetUsC :: class.java)
            startActivity(dclick)
        })
        return view




    }


}

