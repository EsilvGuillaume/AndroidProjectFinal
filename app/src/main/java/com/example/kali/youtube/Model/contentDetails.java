package com.example.kali.youtube.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kali-Multimédia on 21/03/2017.
 */

public class contentDetails {
    @SerializedName("duration")
    @Expose
    private String duration;

    public contentDetails(String duration) {
        this.setDuration(duration);
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
