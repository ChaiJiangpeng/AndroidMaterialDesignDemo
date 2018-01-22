package com.jiangpeng.androiddesigndemo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_snackbar.*

/**
 * Created by Administrator on 2018/1/19.
 */
class SnackbarActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)
        fab.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            fab.id->{
                val snackbar = Snackbar.make(coordinator, "我是Snackbar!", Snackbar.LENGTH_INDEFINITE)
                        .setAction("ido", View.OnClickListener {
                            Toast.makeText(this, "你点击了action", Toast.LENGTH_SHORT).show()
                        })
                snackbar.setActionTextColor(resources.getColor(R.color.colorPrimary))

                snackbar.view.findViewById<TextView>(R.id.snackbar_text).setTextColor(resources.getColor(R.color.colorPrimary))

                snackbar.view.setBackgroundColor(resources.getColor(R.color.colorAccent))
                snackbar.show()
            }
        }
    }
}