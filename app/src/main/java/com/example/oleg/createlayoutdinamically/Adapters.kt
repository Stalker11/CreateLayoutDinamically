package com.example.oleg.createlayoutdinamically

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.oleg.createlayoutdinamically.interfaces.ICallBack
import com.example.oleg.createlayoutdinamically.models.DescriptionFilm


class Adapters(var films: DescriptionFilm, val callBack: ICallBack?) : RecyclerView.Adapter<Adapters.ViewHolder>() {

    private var film: DescriptionFilm = films as DescriptionFilm
    private var callBacks:ICallBack = callBack as ICallBack
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
          holder?.filmName!!.setText(film.title)
          holder.filmDirector.setText(films?.director)
          holder.itemView?.setOnClickListener {
              callBack?.onSucsess("Down")

          }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent?.context).inflate(R.layout.adapter_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 1
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
         val image: ImageView = view.findViewById(R.id.poster) as ImageView
         val filmName:TextView = view.findViewById(R.id.film_name) as TextView
         val filmDirector:TextView = view.findViewById(R.id.film_director) as TextView
    }
}