package org.example;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewOrgPage extends BasePage {
    public NewOrgPage(WebDriver driver) {
        super(driver);
    }

    private WebElement orgName = driver.findElement(By.xpath("//input[contains(@id,'crm_project_name')]"));
    private WebElement orgClick = driver.findElement(By.xpath(".//span[text()='Укажите организацию']"));
    private WebElement orgInput = driver.findElement(By.xpath("//input[@class='select2-input'][1]"));
    private WebElement division = driver.findElement(By.name("crm_project[businessUnit]"));
    private WebElement curator = driver.findElement(By.name("crm_project[curator]"));
    private WebElement leader = driver.findElement(By.name("crm_project[rp]"));
    private WebElement admin = driver.findElement(By.name("crm_project[administrator]"));
    private WebElement manager = driver.findElement(By.name("crm_project[manager]"));
    private WebElement contactClick = driver.findElement(By.xpath("//div[contains(@id, 'contactMain')]"));
    private WebElement contactInput = driver.findElement(By.xpath("//div[contains(@id, 'contactMain')]"));
    private WebElement contactNameClick = driver.findElement(By.xpath("//div[contains(@id, 'contactMain')]"));
    private WebElement btnSuccess = driver.findElement(By.xpath(".//button[@class='btn btn-success action-button']"));

    public NewOrgPage inputOrgName(String inputName) {
        orgName.sendKeys(inputName);
        return this;
    }

    public NewOrgPage clickOrg() {
        orgClick.click();
        return this;
    }

    public NewOrgPage inputOrg(String inputOrg) {
        orgInput.sendKeys(inputOrg);
        return this;
    }

    public NewOrgPage clickOrgName() {
        WebElement orgNameClick = driver.findElement(By.xpath("//.//span[text()='1234']"));
        orgNameClick.click();
        return this;
    }

    public NewOrgPage selectDivision (String selectDivision) {
        Select select = new Select(division);
        select.selectByVisibleText(selectDivision);
        return this;
    }

    public NewOrgPage selectLeader (String selectLeader) {
        Select select = new Select(leader);
        select.selectByVisibleText(selectLeader);
        return this;
    }

    public NewOrgPage selectAdmin (String selectAdmin) {
        Select select = new Select(admin);
        select.selectByVisibleText(selectAdmin);
        return this;
    }

    public NewOrgPage selectManager (String selectManager) {
        Select select = new Select(manager);
        select.selectByVisibleText(selectManager);
        return this;
    }

    public NewOrgPage selectCurator (String selectCurator) {
        Select select = new Select(curator);
        select.selectByVisibleText(selectCurator);
        return this;
    }

/*    public NewOrgPage clickContact() {
        contactClick.click();
        return this;
    }

    public NewOrgPage inputContact(String inputContact) {
        contactInput.sendKeys(inputContact);
        return this;
    }

    public NewOrgPage clickContactName() {
        contactNameClick.click();
        return this;
    }*/

    public AllOrgPage clickCreate() {
        btnSuccess.click();
        return new AllOrgPage (driver);
    }
}
