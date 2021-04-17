package org.example;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewContactsPage extends BasePage {

    public NewContactsPage(WebDriver driver) {
        super(driver);
    }

    private WebElement lastName = driver.findElement(By.xpath("//input[contains(@id, 'lastName')]"));
    private WebElement firstName = driver.findElement(By.xpath("//input[contains(@id, 'firstName')]"));
    private WebElement orgClick = driver.findElement(By.xpath(".//span[text()='Укажите организацию']"));
    private WebElement orgInput = driver.findElement(By.xpath("//input[@class='select2-input']"));
   // private WebElement orgNameClick = driver.findElement(By.xpath(".//span[text()='1234']"));
    private WebElement jobTitle = driver.findElement(By.xpath("//input[contains(@id, 'jobTitle')]"));
    private WebElement btnSuccess = driver.findElement(By.xpath("//button[@class='btn btn-success action-button']"));

    public NewContactsPage inputLastName(String inputLastname) {
        lastName.sendKeys(inputLastname);
        return this;
    }

    public NewContactsPage inputFirstName(String inputFirstName) {
        firstName.sendKeys(inputFirstName);
        return this;
    }

    public NewContactsPage clickOrg() {
        orgClick.click();
        return this;
    }

    public NewContactsPage inputOrg(String inputOrg) {
        orgInput.sendKeys(inputOrg);
        return this;
    }

    public NewContactsPage clickOrgName() {
        WebElement orgNameClick = driver.findElement(By.xpath(".//span[text()='1234']"));
        orgNameClick.click();
        return this;
    }

    public NewContactsPage inputJob(String inputJob) {
        jobTitle.sendKeys(inputJob);
        return this;
    }

    public AllContactsPage clickCreate() {
        btnSuccess.click();
        return new AllContactsPage(driver);
    }
}
