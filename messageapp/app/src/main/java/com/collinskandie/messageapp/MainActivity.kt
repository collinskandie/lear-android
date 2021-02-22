package com.collinskandie.messageapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {

            Log.i("MainActivity","Button Was clicked")

            Toast.makeText(this, "Button was clicked", Toast.LENGTH_SHORT).show()
        }
        btnSendMessageToNextActivity.setOnClickListener {

           val message: String =userMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "Sending...", Toast.LENGTH_SHORT).show()

            val intent = Intent( this, SecondActivity::class.java)
            intent.putExtra("user_message",message)
            startActivity(intent)



        }
    }
}