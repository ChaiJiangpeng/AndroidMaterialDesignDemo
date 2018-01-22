package com.jiangpeng.androiddesigndemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cv1.setOnClickListener(this@MainActivity)
        cv2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            cv1.id->{
                startActivity(Intent(this@MainActivity,FloatingActionButtonActivity::class.java))
            }
            cv2.id->{
                startActivity(Intent(this@MainActivity,SnackbarActivity::class.java))
            }
        }
    }

}
