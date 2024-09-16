package org.example;

import org.example.base.BaseTest;
import org.example.utils.Action;
import org.junit.jupiter.api.Test;

import static org.example.common.Configuration.STUDENT_LOGIN;
import static org.example.common.Configuration.STUDENT_PASSWORD;

public class NewContactsTest extends BaseTest {
    @Test
    public void NewContactTest () {
        new LoginPage(driver)
                .Login(STUDENT_LOGIN, STUDENT_PASSWORD)
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
