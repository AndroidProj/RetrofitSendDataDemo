package com.example.vasundhara.retrofitsenddatademo;

/**
 * Created by Vasundhara on 11/2/2017.
 */

public class ApiUtils {
    private ApiUtils() {
    }

    public static final String BASE_URL = "http://admin.vasundharavision.com/art_work/Api/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
