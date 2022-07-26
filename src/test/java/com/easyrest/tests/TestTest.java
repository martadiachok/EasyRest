package com.easyrest.tests;

import com.easyrest.pages.AdminPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestTest extends BaseTest {

    /**
     * ADMIN PANEL TESTS
     */
    private By AdminPanelButton = By.xpath("//a[@href = '/admin']");
    private By LogOutButton = By.xpath("//*[text()='Log Out']");
    private By usersButton = By.xpath("//span[text()='Users']");
    private By ownersButton = By.xpath("//a[@href = '/admin/owners']");
    private By moderatorsButton = By.xpath("//a[@href = '/admin/moderators']");
    private By restaurantsButton = By.xpath("//a[@href = '/admin/restaurants']");
    private By allButton = By.xpath("//span[contains(text(),'All')]");
    private By activeButton = By.xpath("//span[contains(text(),'Active')]");
    private By bannedButton = By.xpath("//span[contains(text(),'Banned')]");
    private By actionButton = By.cssSelector("td:nth-child(6)");
    private By addModeratorButton = By.xpath("//span[text()='Add moderator']");

    private By emailField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By signInButton = By.xpath("//span[text()='Sign In']");

@Test
    public void banFromActiveUser(){
        driver.get("http://localhost:8880/log-in");
        driver.findElement(emailField).sendKeys("steveadmin@test.com");
        driver.findElement(passwordField).sendKeys("1");
        driver.findElement(signInButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(usersButton).click();
        driver.findElement(activeButton).click();
        List<WebElement> activeUsers = driver.findElements(actionButton);
        if(activeUsers.size() != 0) {
            activeUsers.get(0).click();
        } else {
            System.out.println("There is no one active users.");
        }
    }


    /**
     * CALENDAR TESTS
     */
   /* By chooseYearButton = By.xpath("//*[text()='2022']");
     By yearList = By.xpath("//div[@role='button']");
    By monthName = By.xpath("//*[@class='MuiTypography-root-41 MuiTypography-body1-50 MuiTypography-alignCenter-64']");
    By switchMonthLeftButton = By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[1]/button[1]");
    By monthDates = By.xpath("//div[@role='presentation']");

    By confirmFormButton = By.xpath("//span[text()='OK']");

    By birthDateField = By.xpath("//input[@name='birthDate']");

    @Test
    public void chooseBirthDay() {
            driver.get("http://localhost:8880/sign-up");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(birthDateField).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(chooseYearButton).click();
    //driver.findElement(By.xpath("//div[text()='1997']")).click();

        List<WebElement> years = driver.findElements(yearList);
        int yearListSize = years.size();

        for (int i = 0; i < yearListSize; i++) {
            String text = years.get(i).getText();
            if (text.equalsIgnoreCase("1997")) {
                years.get(i).click();
                break;
            }
        }

        //choose month
        while (!driver.findElement(monthName).getText().contains("April")) {
            driver.findElement(switchMonthLeftButton)
                    .click();
        }

        //choose day
        List<WebElement> dates = driver.findElements(monthDates);
        int count = dates.size();

        for (int i = 0; i < count; i++) {
            String text = dates.get(i).getText();
            if (text.equalsIgnoreCase("22")) {
                dates.get(i).click();
                break;
            }
        }

    } */

    }

