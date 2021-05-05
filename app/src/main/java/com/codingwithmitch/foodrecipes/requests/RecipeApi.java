package com.codingwithmitch.foodrecipes.requests;

import android.arch.lifecycle.LiveData;

import com.codingwithmitch.foodrecipes.requests.responses.ApiResponse;
import com.codingwithmitch.foodrecipes.requests.responses.RecipeResponse;
import com.codingwithmitch.foodrecipes.requests.responses.RecipeSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RecipeApi {

    //    Search
    @GET("api/v2/recipes")
    LiveData<ApiResponse<RecipeSearchResponse>> searchRecipe(
            @Query("q") String query,
            @Query("page") String page
    );

    //Get Recipe Request
    @GET("api/v2/recipes/{Id}")
    LiveData<ApiResponse<RecipeResponse>> getRecipe(
            @Path("Id") String recipe_id
    );
}
