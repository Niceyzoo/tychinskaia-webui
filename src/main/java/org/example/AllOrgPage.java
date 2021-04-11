package org.example;

import org.example.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllOrgPage extends BasePage {
    public AllOrgPage(WebDriver driver) {
        super(driver);
    }

    private WebElement createNewOrg = driver.findElement(By.xpath(".//div[@class='pull-left btn-group icons-holder']//a[text()='Создать проект']"));

    public NewOrgPage clickToNewOrg () {
        createNewOrg.click();
        return new NewOrgPage (driver);
    }

    public AllOrgPage checkNewOrgPopUp() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='extra-actions-panel']")).isDisplayed());
        return this;
    }

}
