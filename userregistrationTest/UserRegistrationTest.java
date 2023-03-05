package com.userregistrationTest;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenPhone_WhenProper_ShouldReturn_True() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("91 8105215414");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhone_WhenNotProper_ShouldReturn_False() {
        UserValidater userValidater = new UserValidater();
        boolean result = userValidater.validatePhone("234234323422234");
        Assert.assertEquals(false,result);
    }
}


class UserValidater {
    private static final String Email= "[91]{2}\\s[0-9]{10}+";

    public boolean validatePhone(String Phone) {
        Pattern pattern = Pattern.compile(Email);
        return pattern.matcher(Email).matches();
    }
}

