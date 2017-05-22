package com.example.oleg.createlayoutdinamically.http.interfaces

import com.example.oleg.createlayoutdinamically.models.DescriptionFilm
import retrofit2.Call
import retrofit2.http.POST



interface VideoRequest {
    @POST("/api/api.php?title=Attack%20on%20titan")
    fun getFilmInformationForTitle(): Call<DescriptionFilm>
}