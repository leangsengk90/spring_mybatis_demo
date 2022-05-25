package com.kshrd.payload.response;

public class AppUserSignUpRes {
    private int id;
    private String name;
    private String email;
    private boolean isEnabled;
    private boolean isLocked;

    public AppUserSignUpRes() {
    }

    public AppUserSignUpRes(int id, String name, String email, boolean isEnabled, boolean isLocked) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isEnabled = isEnabled;
        this.isLocked = isLocked;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}
