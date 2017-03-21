package com.example.kali.youtube.Model;

/**
 * Created by Kali-Multimédia on 21/03/2017.
 */

public class Itembis {
    private snippet snippet;
    private statistics statistics;
    private contentDetails contentDetails;
    public snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(snippet snippet) {
        this.snippet = snippet;
    }

    public com.example.kali.youtube.Model.statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(com.example.kali.youtube.Model.statistics statistics) {
        this.statistics = statistics;
    }

    public com.example.kali.youtube.Model.contentDetails getContentDetails() {
        return contentDetails;
    }

    public void setContentDetails(com.example.kali.youtube.Model.contentDetails contentDetails) {
        this.contentDetails = contentDetails;
    }
}
