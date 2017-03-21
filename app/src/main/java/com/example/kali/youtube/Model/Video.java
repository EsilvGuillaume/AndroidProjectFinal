package com.example.kali.youtube.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kali on 17/03/2017.
 */

public class Video {
    @SerializedName("title")
    @Expose
    private String Title;

    @SerializedName("description")
    @Expose
    private String Description;

    @SerializedName("channelTitle")
    @Expose
    private String Author;

    @SerializedName("publishedAt")
    @Expose
    private String Date;

    public Video(String title, String description, String author, String date) {
        this.Title = title;
        this.Description = description;
        this.Author = author;
        this.Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
