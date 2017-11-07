package com.example.vasundhara.retrofitsenddatademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {

    Button btn;
//    private APIService mAPIService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);

//        mAPIService = ApiUtils.getAPIService();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String name = "testt";
//                String image = "";
//                String story = "testttt";
//                sendPost(name, image, story);

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(APIService.BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                APIService apicall = retrofit.create(APIService.class);

                Call<Post> call=apicall.savePost("","","");
                call.enqueue(new Callback<Post>() {
                    @Override
                    public void onResponse(Call<Post> call, Response<Post> response) {
                        Log.i("onResponse", "post submitted to API." + response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<Post> call, Throwable t) {
                        Log.e("onFailure", "Unable to submit post to API.");
                    }
                });
            }
        });
    }

    public void sendPost(String name, String image, String story) {
//        mAPIService.savePost(name, image, story).enqueue(new Callback<Post>() {
//            @Override
//            public void onResponse(Call<Post> call, Response<Post> response) {
//                if (response.isSuccessful()) {
//                    Log.i("onResponse", "post submitted to API." + response.body().toString());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Post> call, Throwable t) {
//                Log.e("onFailure", "Unable to submit post to API.");
//            }
//        });
    }
}
