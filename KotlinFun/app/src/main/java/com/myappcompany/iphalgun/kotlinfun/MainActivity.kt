package com.myappcompany.iphalgun.kotlinfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    fun reset(view : View){
        count = 0
        textView.setText(count.toString())
        Toast.makeText(applicationContext,"Your score has been reset!",Toast.LENGTH_SHORT).show()
    }

    fun plusOne(view : View){
        count++
        textView.text=count.toString()
        //textView.setText(count.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView = findViewById<TextView>(R.id.textView)
        textView.text="0"
        //textView.setText("Hello World")
    }
}
