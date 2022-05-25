package com.kshrd.payload.request;

public class JwtReq {
    private String email;
    private String password;

    public JwtReq() {
    }

    public JwtReq(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "JwtReq{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
