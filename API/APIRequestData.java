package com.example.test10.API;

import com.example.test10.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("User1")
    Call<ResponseModel> ardUser1Data();
}
