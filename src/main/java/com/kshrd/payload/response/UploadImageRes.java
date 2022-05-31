package com.kshrd.payload.response;

import java.util.List;

public class UploadImageRes {

    private String url;

    public UploadImageRes() {
    }

    public UploadImageRes(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
