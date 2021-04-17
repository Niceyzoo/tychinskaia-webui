package org.example;

import io.qameta.allure.Step;
import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private WebElement inputLogin = driver.findElement(By.cssSelector("input[id='prependedInput']"));
    private WebElement inputPassword = driver.findElement(By.cssSelector(".span2[name='_password']"));
    private WebElement submitButton = driver.findElement(By.xpath(".//button[@name='_submit']"));


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Enter login {login}")
    public LoginPage Login (String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    @Step(value = "Enter Password {password}")
    public LoginPage Password (String password) {
        inputPassword.sendKeys(password);
        return this;
    }

     @Step("Click Enter Button")
             public HomePage EnterButton () {
         submitButton.click();
        return new HomePage(driver);
    }
}
