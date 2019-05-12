package com.yogisagharapurba.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MenuLogin : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var etusername : TextView
    private lateinit var etpassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_login)
        etusername = findViewById(R.id.etloginusername)
        etpassword = findViewById(R.id.etloginpassword)
        button = findViewById(R.id.login)
        button.setOnClickListener{
            startActivity(Intent(this,display::class.java))
        }

        if(intent.extras != null)
        {
            val bundle = intent.extras
            etusername.setText(bundle.getString("Usernamelogin"))
            etpassword.setText(bundle.getString("Passwordlogin"))
        }
        else{
            etusername.setText(intent.getStringExtra("Usernamelogin"))
            etpassword.setText(intent.getStringExtra("Passwordlogin"))
        }
    }



}
