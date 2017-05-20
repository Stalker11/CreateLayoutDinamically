package com.example.oleg.createlayoutdinamically

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.oleg.createlayoutdinamically.interfaces.ICallBack


class Adapters(var counts:Int, val callBack:ICallBack) : RecyclerView.Adapter<Adapters.ViewHolder>() {
    private var count: Int? = counts
    private var callBacks:ICallBack = callBack
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
          holder?.itemView?.setOnClickListener {
              callBack.onSucsess("Down")
          }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 10;
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    }
}