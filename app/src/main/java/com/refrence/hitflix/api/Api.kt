package com.refrence.hitflix.api

import com.refrence.hitflix.model.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "cf49ba936a72c4adb878acc1fea63109",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "cf49ba936a72c4adb878acc1fea63109",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "cf49ba936a72c4adb878acc1fea63109",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}