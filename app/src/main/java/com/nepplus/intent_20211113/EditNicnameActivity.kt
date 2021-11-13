package com.nepplus.intent_20211113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nicname.*

class EditNicnameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nicname)


        bntNickName.setOnClickListener {

            val inputNickname = entNickName.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)
            setResult(RESULT_OK,resultIntent)

            finish()
        }
    }
}