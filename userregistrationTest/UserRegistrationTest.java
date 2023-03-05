package com.userregistrationTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenPassword_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePassword("Pravee125@");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePassword("paveen@");
        Assert.assertEquals(false,result);
    }
}


class UserValidater {
    private static final String Password= "[A-Z]{1,}\\d{1,}[!@#$%^&]{1}[a-z]{1,}";

    public boolean validatePassword(String Password) {
        Pattern pattern = Pattern.compile(Password);
        return pattern.matcher(Password).matches();
    }
}

