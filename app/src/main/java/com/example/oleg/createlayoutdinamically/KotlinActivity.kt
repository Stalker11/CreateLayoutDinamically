package com.example.oleg.createlayoutdinamically

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class KotlinActivity : AppCompatActivity() {
    private var kotlinButton: Button? = null;
    private var kotlinText: TextView? = null;
    private var TAG = "KotlinActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        kotlinText = findViewById(R.id.kotlin_text) as TextView
        kotlinButton = findViewById(R.id.kotlin_button) as Button
        Log.d(TAG,"KotlinActivity"+ kotlinButton)
        kotlinButton?.setOnClickListener{
             var i = Math.random()
            Log.d(TAG,"KotlinActivity"+ i.toString())
            kotlinText?.text = i.toString()

        }
    }
}




