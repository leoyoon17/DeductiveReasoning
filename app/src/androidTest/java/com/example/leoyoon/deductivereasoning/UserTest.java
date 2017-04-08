package com.example.leoyoon.deductivereasoning;

import junit.framework.TestCase;

/**
 * Created by Leo Yoon on 05/04/2017.
 */

public class UserTest extends TestCase {
    public void testGetUserFirstName() {
        String userFirstName = "TestUser";
        User user = new User(userFirstName,"");
        assertEquals("TestUser",user.getUserFirstName());
    }

    public void testSetUserFirstName(){
        String userName = "TestUser";
        User user = new User(userName,"");
        String userName2 = "TestUser";
        user.setUserFirstName(userName2);
        assertEquals(userName2, user.getUserFirstName());
    }

    public void testGetUserLastName() {
        String userLastName = "TestUser";
        User user = new User("",userLastName);
        assertEquals("TestUser",user.getUserLastName());
    }

    public void testSetUserLastName() {
        String userLastName = "TestUser";
        User user = new User(userLastName, "");
        String userLastName2 =  "TestUser2";
        user.setUserLastName(userLastName2);
        assertEquals(userLastName2,user.getUserLastName());
    }


}
