package com.poputstoe_assignment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.DialogFragment
import com.poputstoe_assignment.R

class add_bank1 : DialogFragment() {
    lateinit var add_bank:AppCompatButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_add_bank1, container, false)
        add_bank=view.findViewById(R.id.bank)
        add_bank.setOnClickListener {
            val dialog=add_bank2()
            dialog.show((activity as AppCompatActivity).supportFragmentManager,"showPopUp")
        }
        return  view
    }
}