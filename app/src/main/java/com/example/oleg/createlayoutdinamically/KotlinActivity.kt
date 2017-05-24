package com.example.oleg.createlayoutdinamically

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.oleg.createlayoutdinamically.http.interfaces.Requests
import com.example.oleg.createlayoutdinamically.interfaces.ICallBack

class KotlinActivity : AppCompatActivity(),ICallBack {
    private val TAG = "Kot"
    override fun onSucsess(error: String) {
        Log.d(TAG,"KotlinActivity"+ error)
        kotlinText?.text = error
    }

    override fun onError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var kotlinButton: Button? = null
    private var kotlinText: TextView? = null
    private var kotlinRecycler: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        kotlinText = findViewById(R.id.kotlin_text) as TextView
        kotlinButton = findViewById(R.id.kotlin_button) as Button
        kotlinRecycler = findViewById(R.id.recycler) as RecyclerView
       // kotlinRecycler?.adapter = Adapters(null,this)
        kotlinRecycler!!.layoutManager = LinearLayoutManager(this)
        Log.d(TAG,"KotlinActivity"+ kotlinButton)
        kotlinButton?.setOnClickListener{
             var i = Math.random()
            Log.d(TAG,"KotlinActivity"+ i.toString())
            kotlinText?.text = i.toString()

        }
        Requests().getVideoTitle()
    }

}




