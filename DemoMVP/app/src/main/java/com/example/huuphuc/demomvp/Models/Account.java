package com.example.huuphuc.demomvp.Models;

/**
 * Created by HuuPhuc on 11/07/2017.
 */

public class Account {
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

    private String username;
    private String password;

    public Account(String _username,String _password)
    {
        this.username=_username;
        this.password=_password;
    }
}
