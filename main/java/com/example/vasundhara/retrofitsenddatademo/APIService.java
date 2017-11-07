package com.example.vasundhara.retrofitsenddatademo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Vasundhara on 11/2/2017.
 */

public interface APIService {
    String BASE_URL = "http://admin.vasundharavision.com/art_work/Api/";

    @POST("addScaryData")
    @FormUrlEncoded
    Call<Post> savePost(@Field("name") String name,
                        @Field("image") String image,
                        @Field("story") String story);
//    Call<Post> savePost(@Body Post post);
}
