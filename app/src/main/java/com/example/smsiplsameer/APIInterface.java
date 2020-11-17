package com.example.smsiplsameer;

import android.provider.ContactsContract;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface APIInterface {


    @Multipart
    @POST("seat-map.php")
    Call<URLResponse> getData(@Query("key") String key,
                              @Part("auth_key") String auth_key,
                              @Part("password") String pass);



}
