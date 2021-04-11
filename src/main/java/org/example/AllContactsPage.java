package org.example;

import org.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllContactsPage extends BasePage {
    public AllContactsPage(WebDriver driver) {
        super(driver);
    }

    private WebElement createNewContact = driver.findElement(By.xpath("//a[text()='Создать контактное лицо']"));

    public NewContactsPage clickToNewContact () {
        createNewContact.click();
        return new NewContactsPage (driver);
    }

    public AllContactsPage checkNewContactPopUp() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='extra-actions-panel']")).isDisplayed());
        return this;
    }
}
