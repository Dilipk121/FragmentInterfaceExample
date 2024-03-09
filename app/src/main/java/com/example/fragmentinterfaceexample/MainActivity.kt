package com.example.fragmentinterfaceexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), MyInterface {

    lateinit var maintxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        maintxt = findViewById(R.id.main_txt)

        val fragment = FirstFragment()

        supportFragmentManager.beginTransaction().apply {

            replace(R.id.frame, fragment)
                .commit()

        }

    }

    override fun displayMessage(msg: String) {
        maintxt.text = msg
    }
}