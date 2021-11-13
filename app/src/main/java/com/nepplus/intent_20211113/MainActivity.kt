package com.nepplus.intent_20211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    멤버변수
    val REQ_FOR_NICNAME = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToother.setOnClickListener {

            val myIntent = Intent(this, ActivityToother::class.java)
            startActivity(myIntent)
        }

        btnsendMassge.setOnClickListener {
           val inputMessge = edtMassage.text.toString()
           val myIntent = Intent(this, ViewActivity::class.java)
           myIntent.putExtra("message",inputMessge)
           startActivity(myIntent)
        }

        btnEditNicname.setOnClickListener {
            val myIntent = Intent(this,EditNicnameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICNAME)



            }

        }
    }
