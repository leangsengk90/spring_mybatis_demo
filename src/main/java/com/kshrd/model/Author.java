package com.kshrd.model;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Author {
    private int id;
    private String name;
    private String[] email;
    private JSONObject address;
    private LocalDateTime createDate;

    public Author() {
    }

    public Author(int id, String name, String[] email, JSONObject address, LocalDateTime createDate) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email=" + Arrays.toString(email) +
                ", address=" + address +
                ", createDate=" + createDate +
                '}';
    }
}
