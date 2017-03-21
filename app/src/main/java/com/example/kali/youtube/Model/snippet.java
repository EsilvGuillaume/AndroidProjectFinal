package com.example.kali.youtube.Model;

/**
 * Created by Kali-Multimédia on 20/03/2017.
 */
import android.provider.MediaStore;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class snippet implements Serializable
{
    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;
    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("channelTitle")
    @Expose
    private String channelTitle;

    public snippet() {
    }

    private thumbnails thumbnails;
    /**
     *
     * @param publishedAt
     * @param title
     * @param channelId
     * @param description
     * @param channelTitle
     */
    public snippet(String publishedAt, String channelId, String title, String description, String channelTitle) {
        super();
        this.publishedAt = publishedAt;
        this.title = title;
        this.description = description;
        this.channelTitle = channelTitle;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public com.example.kali.youtube.Model.thumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(com.example.kali.youtube.Model.thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }
}

