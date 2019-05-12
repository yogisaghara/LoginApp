package com.yogisagharapurba.loginapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class display : AppCompatActivity(){
    override fun onCreate(SavedInstanceState:Bundle?){
        val savedInstanceState = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display)
    }
}