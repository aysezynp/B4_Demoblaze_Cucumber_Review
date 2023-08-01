package com.demoblaze.pages;

import com.demoblaze.utilities.ConfigurationReader;
import org.junit.Assert;

public class HomePage extends BasePage{

    public void verifyLogin(){
        String actualUserName=nameofuser.getText();
        String expectedUserName= ConfigurationReader.get("username");
        Assert.assertFalse(actualUserName.contains(expectedUserName));
    }

    public void verifyLogin(String nameOfUser){
        String actualUserName=nameofuser.getText();
        Assert.assertEquals(nameOfUser,actualUserName);
    }



}
