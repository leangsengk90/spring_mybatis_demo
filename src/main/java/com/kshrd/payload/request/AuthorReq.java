package com.kshrd.payload.request;

import com.alibaba.fastjson2.JSONObject;

import java.time.LocalDateTime;

public class AuthorReq {

    private String name;
    private String[] email;
    private JSONObject address;
    private LocalDateTime createDate;

    public AuthorReq() {
    }

    public AuthorReq(String name, String[] email, JSONObject address, LocalDateTime createDate) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.createDate = createDate;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getEmail() {
        return email;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public JSONObject getAddress() {
        return address;
    }

    public void setAddress(JSONObject address) {
        this.address = address;
    }
}
