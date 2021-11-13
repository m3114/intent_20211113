package com.nepplus.intent_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view.*

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
//        이 중과로 안에 적는 일들은 - 화면에 들러올때 같이 실행애주는 일등
//        1. 나한테 보내준 문구를 받아서 변수로 담아주자.
//        나한데 온 intent를 이용하자. 짐을 꺼내낮

        val edtMassage = intent.getStringExtra("message")
//        2. 메시지를 보여주는 덱스틉의 문구롤 변경 set

        txtMessage.text = edtMassage

    }
}