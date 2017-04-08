package com.example.leoyoon.deductivereasoning;

import java.io.Serializable;

/**
 * Created by Leo Yoon on 05/04/2017.
 */

public class User implements Serializable {
    private static User _instance;
    /* Note: User's Agent name = userName */
    protected String userFirstName;
    protected String userLastName;

    public User(String userFirstName, String userLastName) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
    }


    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userName) {
        this.userFirstName = userName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserLastName() {
        return userLastName;
    }
}
