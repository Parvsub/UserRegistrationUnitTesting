package com.userregistrationTest;

import org.junit.Assert;
import org.junit.TestL;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenLastName_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateLastName("Kumar");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validateLastName("ku");
        Assert.assertEquals(false,result);
    }
}


 class UserValidater {
     private static final String Last_name = ("[A-Z]{1}[a-z]+");

     public boolean validateLastName(String last_name) {
         Pattern pattern = Pattern.compile(Last_name);
         return pattern.matcher(Last_name).matches();
     }
 }