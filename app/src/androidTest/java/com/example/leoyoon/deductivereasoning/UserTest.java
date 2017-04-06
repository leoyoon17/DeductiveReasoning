package com.example.leoyoon.deductivereasoning;

import junit.framework.TestCase;

/**
 * Created by Leo Yoon on 05/04/2017.
 */

public class UserTest extends TestCase {
    public void testGetUserName() {
        String userName = "TestUser";
        User user = new User(userName);
        assertEquals("TestUser",user.getUserName());
    }

    public void testSetUserName(){
        String userName = "TestUser";
        User user = new User(userName);
        String userName2 = "TestUser";
        user.setUserName(userName2);
        assertEquals(userName2, user.getUserName());
    }
}
