package com.example.fragmentinterfaceexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =  inflater.inflate(R.layout.fragment_first, container, false)


        val et_txt = view.findViewById<EditText>(R.id.et_txt)
        val btn_send = view.findViewById<Button>(R.id.btn_send)


        val myInterface : MyInterface = activity as MyInterface

        btn_send.setOnClickListener(){

            val msg = et_txt.text.toString()

            myInterface.displayMessage(msg)


        }


        return view
    }


}