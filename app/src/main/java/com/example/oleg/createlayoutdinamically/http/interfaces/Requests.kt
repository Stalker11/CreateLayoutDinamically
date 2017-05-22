package com.example.oleg.createlayoutdinamically.http.interfaces

import android.util.Log
import com.example.oleg.createlayoutdinamically.models.DescriptionFilm
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Requests {
    private val request: VideoRequest
    val TAG = "Request"

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://netflixroulette.net")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        request = retrofit.create(VideoRequest::class.java)
    }

    public fun getVideoTitle() {
        var dd: Call<DescriptionFilm> = request.getFilmInformationForTitle()
        dd.enqueue(object : Callback<DescriptionFilm> {
            override fun onFailure(call: Call<DescriptionFilm>?, t: Throwable?) {
                Log.d(TAG, "request" + t?.message)
            }

            override fun onResponse(call: Call<DescriptionFilm>?, response: Response<DescriptionFilm>?) {
                Log.d(TAG, "request" + response?.body()?.raiting+" "+call?.request()!!.url())
            }

        })

    }
}


