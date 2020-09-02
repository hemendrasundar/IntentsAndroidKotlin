package com.hemendra.intenttest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity :AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
            // recieving data from the previous activity
     var name = intent.getStringExtra("name")
     var phonenum = intent.getLongExtra("mobile",0)
        
        txt_disply.text = "name:$name \n mobile:$phonenum"
        
    }
}