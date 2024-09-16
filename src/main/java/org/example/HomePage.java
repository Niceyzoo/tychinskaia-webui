package org.example;

import org.example.base.BasePage;
import org.example.utils.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.*;

public class HomePage extends BasePage {


    WebElement contractor = driver.findElement(By.xpath("//a[@href]//span[text()='Контрагенты']"));
    WebElement contact = driver.findElement(By.xpath("//a[@href]//span[text()='Контактные лица']"));

    WebElement project = driver.findElement(By.xpath(".//ul[@class='nav nav-multilevel main-menu']/li[@class='dropdown']/a[@class='unclickable']/span[text()='Проекты']"));
    WebElement myProject = driver.findElement(By.xpath("//a[@href]//span[text()='Все проекты']"));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public AllContactsPage redirectToAllContactsPage() {
        Action.moveCursorToNavigationTab(contractor, driver);
        contact.click();
        return new AllContactsPage(driver);
    }

    public AllOrgPage redirectToAllOrgPage() {
        Action.moveCursorToNavigationTab(project, driver);
        myProject.click();
        return new AllOrgPage(driver);
    }

    public void checkUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }
}

