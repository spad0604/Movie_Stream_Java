package com.example.moviestreaming.GetApi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchApiService {
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();
    SearchApiService searchApiService = new Retrofit.Builder()
            .baseUrl("https://phimapi.com/v1/api/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(SearchApiService.class);
    @GET("tim-kiem")
    Call<ApiRespone> SearchMovie(@Query("keyword") String key);
}
