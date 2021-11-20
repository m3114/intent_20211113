package com.nepplus.intent_20211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_toother.*

class ActivityToother : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toother)

        btnRetrunMain.setOnClickListener {

            val myintent = Intent(this,MainActivity::class.java)

            finish()
//            startActivity(myintent)



//            val myintent = Intent(this.EditNicnameActivity::class.java)

//            finish()


        }
//        btnEditNicname.setOnClickListener {
//            val myintent = Intent(this,editnicnameActivity::class.java)


//            finish()

        }
    }
