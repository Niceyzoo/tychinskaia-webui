package org.example;

import io.qameta.allure.Step;
import org.example.base.BasePage;
import org.example.utils.Action;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePage extends BasePage {


    WebElement contractor = driver.findElement(By.xpath("//a[@href]//span[text()='Контрагенты']"));
    WebElement contact = driver.findElement(By.xpath("//a[@href]//span[text()='Контактные лица']"));

    WebElement project = driver.findElement(By.xpath(".//ul[@class='nav nav-multilevel main-menu']/li[@class='dropdown']/a[@class='unclickable']/span[text()='Проекты']"));
    WebElement myProject = driver.findElement(By.xpath("//a[@href]//span[text()='Все проекты']"));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("redirect to page all contacts")
    public AllContactsPage redirectToAllContactsPage() {
        Action.moveCursorToNavigationTab(contractor, driver);
        contact.click();
        return new AllContactsPage(driver);
    }

    @Step("redirect to page all projects")
    public AllOrgPage redirectToAllOrgPage() {
        Action.moveCursorToNavigationTab(project, driver);
        myProject.click();
        return new AllOrgPage(driver);
    }

    @Step("assert that current url equals {url}")
    public HomePage checkUrl(String url) {
        wait10second.until(ExpectedConditions.urlToBe(url));
        assertEquals(driver.getCurrentUrl(), url);
        return this;


          //  assertEquals(driver.getCurrentUrl(), url);

    }
}

