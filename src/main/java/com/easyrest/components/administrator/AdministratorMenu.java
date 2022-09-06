package com.easyrest.components.administrator;

import com.easyrest.pages.administratorPanel.AcceptedOrders;
import com.easyrest.pages.administratorPanel.WaitingForConfirmOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.easyrest.constants.Constants.TimeoutVariable.EXPLICIT_WAIT;

public class AdministratorMenu {
    private final WebDriver driver;
    private final By waitingForConfirmOrdersTab = By.xpath("//div[@role='tablist']//button[1]");
    private final By acceptedOrdersTab = By.xpath("//div[@role='tablist']//button[2]");
    private final By assignedWaitersOrdersTab = By.xpath("//div[@role='tablist']//button[3]");
    private final By waitersOrdersTab = By.xpath("//div[@role='tablist']//button[4]");
    private final By selectedTab = By.xpath("//button[@aria-selected='true']");

    public AdministratorMenu(WebDriver driver) {
        this.driver = driver;
    }

    public WaitingForConfirmOrders clickOnWaitingForConfirmOrdersTab() {
        try {
            driver.findElement(waitingForConfirmOrdersTab).click();
        } catch (Exception e) {
            driver.navigate().refresh();
            new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT))
                    .until(ExpectedConditions.elementToBeClickable(waitingForConfirmOrdersTab)).click();
        }
        return new WaitingForConfirmOrders(driver);
    }

    public AcceptedOrders clickOnAcceptedOrdersTab() {
        try {
            driver.findElement(acceptedOrdersTab).click();
        } catch (Exception e) {
            driver.navigate().refresh();
            new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT))
                    .until(ExpectedConditions.elementToBeClickable(acceptedOrdersTab)).click();
        }
        return new AcceptedOrders(driver);
    }

    public void clickOnAssignedWaitersTab() {
        driver.findElement(assignedWaitersOrdersTab).click();
    }

    public void clickOnWaitersTab() {
        driver.findElement(waitersOrdersTab).click();
    }

    public String getSelectedTabName() {
        return driver.findElement(selectedTab).getText();
    }

}
