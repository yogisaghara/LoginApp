package com.yogisagharapurba.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btSubmitIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUsername = findViewById(R.id.et_username)
        etPassword = findViewById(R.id.et_password)
        btSubmitIntent = findViewById(R.id.bt_daftarintent)

        btSubmitIntent.setOnClickListener {
            val intent = Intent(this, MenuLogin::class.java)
            intent.putExtra("username", etUsername.text.toString())
            intent.putExtra("password", etPassword.text.toString())
            startActivity(intent)

        }
    }

}
