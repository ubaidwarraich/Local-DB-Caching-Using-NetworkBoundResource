package com.codingwithmitch.foodrecipes.util;

public class Constants {

    public static final String BASE_URL = "https://recipesapi.herokuapp.com/";


    // YOU NEED YOUR OWN API KEY!!!!!!!!!!!!! https://www.food2fork.com/about/api
    public static final String API_KEY = "dadc63b6325aaf398163b40fea9b5e79";

    public static final int CONNECTION_TIMEOUT = 5; //seconds
    public static final int READ_TIMEOUT = 2;
    public static final int WRITE_TIMEOUT = 2;

    public static final int RECIPE_REFRESH_TIME = 60 * 60 * 24 * 30;//30 days in seconds


    public static final String[] DEFAULT_SEARCH_CATEGORIES =
            {"Barbeque", "Breakfast", "Chicken", "Beef", "Brunch", "Dinner", "Wine", "Italian"};

    public static final String[] DEFAULT_SEARCH_CATEGORY_IMAGES =
            {
                    "barbeque",
                    "breakfast",
                    "chicken",
                    "beef",
                    "brunch",
                    "dinner",
                    "wine",
                    "italian"
            };
}
