package org.example;

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

    public HomePage Login (String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        submitButton.click();
        return new HomePage(driver);
    }
}
