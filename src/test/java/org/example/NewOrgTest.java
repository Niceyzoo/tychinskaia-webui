package org.example;

import io.qameta.allure.Feature;
import org.example.base.BaseTest;
import org.example.utils.Action;
import org.junit.jupiter.api.Test;

import static org.example.common.Configuration.STUDENT_LOGIN;
import static org.example.common.Configuration.STUDENT_PASSWORD;


@Feature("Project")
public class NewOrgTest extends BaseTest {
    @Test
    public void NewOrgTest() {
        new LoginPage(driver)
                .Login(STUDENT_LOGIN)
                .Password(STUDENT_PASSWORD)
                .EnterButton()
                .redirectToAllOrgPage()
                .clickToNewOrg()
                .inputOrgName("00kkjhgj1")
                .clickOrg()
                .inputOrg("1234")
                .clickOrgName()
                .selectDivision("Research & Development")
                .selectCurator("Applanatest Applanatest Applanatest")
                .selectLeader("Applanatest Applanatest Applanatest")
                .selectAdmin("Амелина Светлана")
                .selectManager("Applanatest Applanatest Applanatest")
                /*.clickContact()
                .inputContact("123 123")
                .clickContactName()*/
                .clickCreate()
                .checkNewOrgPopUp();

    }
}