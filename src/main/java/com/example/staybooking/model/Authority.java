package com.example.staybooking.model;

import javax.persistence.Id;
import java.io.Serializable;

public class Authority implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    private String username;
    private String authority;

    public Authority(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }

    public Authority() {
    }

    public String getUsername() {
        return username;
    }

    public Authority setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getAuthority() {
        return authority;
    }

    public Authority setAuthority(String authority) {
        this.authority = authority;
        return this;
    }
}
