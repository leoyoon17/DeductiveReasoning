package com.example.leoyoon.deductivereasoning;

/**
 * Created by Leo Yoon on 05/04/2017.
 */

public class User {

    protected String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
