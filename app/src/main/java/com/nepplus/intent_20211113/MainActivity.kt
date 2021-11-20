package com.nepplus.intent_20211113

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    멤버변수
    val REQ_FOR_NICNAME = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener {
            val inputPhoneNum = edtPhoneNum.text.toString()
//            그 전화번호에 실제 전화연결
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = intent(Intent.ACTION_DIAL,myUri)
            startActivity(myIntent)

        }
//입력한 전화번호. 추출(변수에 저장
//        그 전화번호에 실제 전화걸기(dial)
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        requestcode : 어떤것을 가지러 다녀온건지 알려주는 숫자가 기록됨

        if (requestCode == REQ_FOR_NICNAME){
//            닉네임을 가지러 다녀왔을때 실행됨
//            resultCode : 확인(ok)/ 취소(cancel) 중 어떤것을 눌렸는지 알려줌

            if(resultCode == RESULT_OK){
//                닉네임을 가지러 가서 - 확인도 누르게 맞을때 실행되는 코드
//             data : 이전 화면에서 담아둔 resultintent를 들고 있는 역할
                val newNickname = data?.getStringArrayExtra("nick")

               txtNickname.text = newNickname

            }
    }
    }


    }
