package com.example.myapplication000

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL="https://newsapi.org/"
const val API_KEY="acbf05cb82074db292a102a8dcf3816b"

interface NewsInterface {
    @GET("v2/top-headlines?apiKey=$API_KEY")
     fun getHeadlines(@Query("country") country: String, @Query("page") page: Int):Call<News>
}
      object NewsService{
    val newsInstance:NewsInterface
    init {
        val retrofit: Retrofit =Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
             newsInstance=retrofit.create(NewsInterface::class.java)
    }
}