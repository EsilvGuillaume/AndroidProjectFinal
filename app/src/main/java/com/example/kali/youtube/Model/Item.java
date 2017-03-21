package com.example.kali.youtube.Model;

import com.example.kali.youtube.Model.snippet;

public class Item {
    private snippet snippet;
    private Id id;

    public snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(snippet snippet) {
        this.snippet = snippet;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
