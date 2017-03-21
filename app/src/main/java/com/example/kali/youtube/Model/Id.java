package com.example.kali.youtube.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kali-Multimédia on 20/03/2017.
 */

public class Id {

    @SerializedName("videoId")
    @Expose
    private String videoId;

    public Id() {
    }

    /**
     * @param videoId
     */
    public Id(String videoId) {
        super();
        this.videoId = videoId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
