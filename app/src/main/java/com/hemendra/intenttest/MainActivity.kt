package com.hemendra.intenttest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Explicit Intent
        btn_open_Activity.setOnClickListener {

            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            //send data to ther activity
             intent.putExtra("name",et_name.text.toString())
             intent.putExtra("mobile",et_phone.text.toString().toLong())
             startActivity(intent)


        }

        //implicit intent
        btn_dial.setOnClickListener {

            var intent = Intent()
            intent.action =Intent.ACTION_DIAL
            intent.data = Uri.parse("tel:"+8699926080)
            startActivity(intent)
        }
        btn_web.setOnClickListener {
            var intent = Intent()
            intent.action =Intent.ACTION_VIEW
            intent.data = Uri.parse("http://www.google.com")
            startActivity(intent)
        }

        btn_file.setOnClickListener {
            var intent = Intent()
            intent.action =Intent.ACTION_GET_CONTENT
            intent.type = "audio/*" //- All formats - .mp3, .amr...
            startActivity(intent)

        }
        btn_instagram.setOnClickListener {

            var intent = packageManager.getLaunchIntentForPackage("com.atomic.apps.ringtone.cutter")
            if(intent!=null) {
                startActivity(intent)
            }
            else{
                var intent = Intent()
                intent.action =Intent.ACTION_VIEW
                intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.atomic.apps.ringtone.cutter")
                startActivity(intent)
            }

        }

        btn_whatsapp.setOnClickListener {
            var intent = packageManager.getLaunchIntentForPackage("com.whatsapp")
            startActivity(intent)
        }
    }
}