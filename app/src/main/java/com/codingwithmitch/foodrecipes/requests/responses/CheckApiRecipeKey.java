package com.codingwithmitch.foodrecipes.requests.responses;

public class CheckApiRecipeKey {
    protected static boolean isRecipeApiKeyValid(RecipeSearchResponse response) {
        return response.getError() == null;
    }

    protected static boolean isRecipeApiKeyValid(RecipeResponse response) {
        return response.getError() == null;
    }
}
