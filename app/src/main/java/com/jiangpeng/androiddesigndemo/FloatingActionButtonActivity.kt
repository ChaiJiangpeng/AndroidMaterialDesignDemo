package com.jiangpeng.androiddesigndemo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_float_action_button.*

/**
 * Created by Administrator on 2018/1/19.
 */
class FloatingActionButtonActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_float_action_button)
        fab.setOnClickListener(this@FloatingActionButtonActivity)
        content.text = "各个属性的意思：\n" +
                "backgroundTint - 设置FAB的背景颜色。\n " +
                "rippleColor - 设置FAB点击时的背景颜色\n " +
                "borderWidth - 内边距 可以自己实现看下效果\n " +
                "elevation 默认状态下阴影大小\n " +
                "fabSize 设置大小，该属性有两个值，分别为normal和mini，对应的大小分别为56dp和40dp\n " +
                "pressedTranslationZ 按钮按下去的状态下的阴影大小\n" +
                "app:useCompatPadding 设置为true时 那么在5.0设备上点击后会显示正方形填充效果\n"
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            fab.id->{
                Snackbar.make(fab,"我是FloatingActionButtonActivity!",Snackbar.LENGTH_LONG).show()
            }
        }
    }
}