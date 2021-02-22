package com.collinskandie.messageapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

       val bundle: Bundle?= intent.extras
       val msg= bundle!!.getString("user_message")
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()

    }
}