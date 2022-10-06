package com.poputstoe_assignment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.DialogFragment
import com.poputstoe_assignment.R

class add_bank2 : DialogFragment() {
    lateinit var spinner:Spinner
    val account= arrayOf("Select Account Type","Saving","Current")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_add_bank2, container, false)
        spinner=view.findViewById(R.id.spinner)
        val arrayAdapter=ArrayAdapter<String>(requireActivity(),android.R.layout.simple_spinner_dropdown_item,account)
        spinner.adapter=arrayAdapter
        return view
    }
}