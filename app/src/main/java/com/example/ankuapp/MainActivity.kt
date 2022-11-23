package com.example.ankuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {        //supress action bar
            supportActionBar!!.hide()



        //splash screen
        Handler().postDelayed({
            val intent =Intent(this,template_selection::class.java)
            startActivity(intent)
            finish()
        },1500)

    }
    }
}
