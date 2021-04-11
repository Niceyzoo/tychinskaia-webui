package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action {
    public static void moveCursorToNavigationTab (WebElement tabContactor, WebDriver driver) {
        Actions action = new Actions(driver);
        action
                .moveToElement(tabContactor)
                .build()
                .perform();
    }
}
