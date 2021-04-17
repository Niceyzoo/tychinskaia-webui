package org.example;

import io.qameta.allure.Feature;
import org.example.base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.example.common.Configuration.STUDENT_LOGIN;
import static org.example.common.Configuration.STUDENT_PASSWORD;
import static org.example.common.Configuration.BASE_URL;
import org.example.LoginPage;

@Feature("Login")

public class LoginTest extends BaseTest {
    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .Login(STUDENT_LOGIN)
                .Password(STUDENT_PASSWORD)
                .EnterButton()
                .checkUrl(BASE_URL);

      //  tearDown();


    }
}
