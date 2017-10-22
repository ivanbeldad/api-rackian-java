package com.rackian.api.domain;

import java.time.ZonedDateTime;

public class User {

    private String id;
    private String email;
    private String username;
    private String password;
    private ZonedDateTime lastLogin;
    private ZonedDateTime joined;
    private boolean isActive;
    private long space;

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ZonedDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(ZonedDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public ZonedDateTime getJoined() {
        return joined;
    }

    public void setJoined(ZonedDateTime joined) {
        this.joined = joined;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public long getSpace() {
        return space;
    }

    public void setSpace(long space) {
        this.space = space;
    }

}
