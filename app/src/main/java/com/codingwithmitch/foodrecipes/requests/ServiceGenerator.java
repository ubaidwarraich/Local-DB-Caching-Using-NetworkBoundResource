package com.codingwithmitch.foodrecipes.requests;

import com.codingwithmitch.foodrecipes.util.Constants;
import com.codingwithmitch.foodrecipes.util.LiveDataCallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.codingwithmitch.foodrecipes.util.Constants.CONNECTION_TIMEOUT;
import static com.codingwithmitch.foodrecipes.util.Constants.READ_TIMEOUT;
import static com.codingwithmitch.foodrecipes.util.Constants.WRITE_TIMEOUT;

public class ServiceGenerator {

    private static OkHttpClient client=new OkHttpClient.Builder()
            // establish a connection to server ping the server
            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            //time between each byte read from the server
            .readTimeout(READ_TIMEOUT,TimeUnit.SECONDS)
            //time between each byte sent to server
            .writeTimeout(WRITE_TIMEOUT,TimeUnit.SECONDS)
            //okhttp will not retry to ping the network
            .retryOnConnectionFailure(true)
            .build();

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    //added okhttp client below
                    .client(client)
                    .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static RecipeApi recipeApi = retrofit.create(RecipeApi.class);

    public static RecipeApi getRecipeApi(){
        return recipeApi;
    }
}
