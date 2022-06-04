package com.kshrd.model;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.Arrays;
import java.util.List;

public class Author {
    private int id;
    private String name;
    private String[] email;
    private JSONObject address;

    public Author() {
    }

    public Author(int id, String name, String[] email, JSONObject address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
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
                ", email=" + email +
                ", address=" + address +
                '}';
    }
}
