package com.codingwithmitch.foodrecipes.models;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import java.util.Arrays;
@Entity(tableName = "recipes")
public class Recipe implements Parcelable{

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "recipe_id")
    private String id;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "publisher")
    private String publisher;

    @ColumnInfo(name = "imageUrl")
    private String imageUrl;

    @ColumnInfo(name = "socialUrl")
    private float socialUrl;

    @ColumnInfo(name = "ingredients")
    private String[] ingredients;

    /**
     * Saves current timestamp in **SECONDS**
     */
    @ColumnInfo(name = "timestamp")
    private int timestamp;


    public Recipe(@NonNull String id, String title, String publisher, String imageUrl, float socialUrl, String[] ingredients, int timestamp) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.imageUrl = imageUrl;
        this.socialUrl = socialUrl;
        this.ingredients = ingredients;
        this.timestamp = timestamp;
    }

    @Ignore
    public Recipe() {
    }

    @Ignore
    public Recipe(Recipe recipe){
        this.title = recipe.title;
        this.publisher = recipe.publisher;
        this.ingredients = recipe.ingredients;
        this.id = recipe.id;
        this.imageUrl = recipe.imageUrl;
        this.socialUrl = recipe.socialUrl;
        this.timestamp = recipe.timestamp;
    }


    protected Recipe(Parcel in) {
        id = in.readString();
        title = in.readString();
        publisher = in.readString();
        imageUrl = in.readString();
        socialUrl = in.readFloat();
        ingredients = in.createStringArray();
        timestamp = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(title);
        dest.writeString(publisher);
        dest.writeString(imageUrl);
        dest.writeFloat(socialUrl);
        dest.writeStringArray(ingredients);
        dest.writeInt(timestamp);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public float getSocialUrl() {
        return socialUrl;
    }

    public void setSocialUrl(float socialUrl) {
        this.socialUrl = socialUrl;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", socialUrl=" + socialUrl +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", timestamp=" + timestamp +
                '}';
    }
}














