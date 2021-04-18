package org.example;

import io.qameta.allure.Feature;
import org.example.base.BaseTest;
import org.example.utils.Action;
import org.junit.jupiter.api.Test;

import static org.example.common.Configuration.STUDENT_LOGIN;
import static org.example.common.Configuration.STUDENT_PASSWORD;


@Feature("Contacts")
public class NewContactsTest extends BaseTest {
    @Test
    public void NewContactTest() {
        new LoginPage(driver)
                .Login(STUDENT_LOGIN)
                .Password(STUDENT_PASSWORD)
                .EnterButton()
                .redirectToAllContactsPage()
                .clickToNewContact()
                .inputLastName("123")
                .inputFirstName("123")
                .clickOrg()
                .inputOrg("1234")
                .clickOrgName()
                .inputJob("test")
                .clickCreate()
                .checkNewContactPopUp();
    }
}
