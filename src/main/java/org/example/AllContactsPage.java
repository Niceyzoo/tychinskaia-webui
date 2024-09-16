package org.example;

import org.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
        String message = wait10second.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
                "div[class='message']"))).getText();
        assertTrue(message.contains("Контактное лицо сохранено"));
        return this;
    }
}
