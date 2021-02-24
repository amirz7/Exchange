package com.example.arz;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("/getCurrency/2")
    public Call<List<MultipleResource>> getCurrency();
}
