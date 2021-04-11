package org.example;

import org.example.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.example.common.Configuration.STUDENT_LOGIN;
import static org.example.common.Configuration.STUDENT_PASSWORD;


public class LoginTest extends BaseTest {
    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .Login(STUDENT_LOGIN, STUDENT_PASSWORD);

    }
}
