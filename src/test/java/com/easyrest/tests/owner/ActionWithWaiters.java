package com.easyrest.tests.owner;

import com.easyrest.components.owner.CreateNewEmployee;
import com.easyrest.components.owner.Waiters;
import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.facade.owner.CreateNewWaiterFacade;
import com.easyrest.pages.OwnerPanel;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionWithWaiters extends BaseTest {

    private final String ownerEmail = ConfigProvider.ownerEmail;
    private final String ownerPassword = ConfigProvider.ownerPassword;
    private SignInPage signInPage;
    private SignInFacade signInFacade;
    private CreateNewWaiterFacade createNewWaiterFacade;
    private Waiters waiters;
    private CreateNewEmployee createNewEmployee;
    //TODO create package with UserDate for JavaFaker
    Faker faker = new Faker();
    String name = faker.name().fullName();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password(8, 12);
    String phone = faker.phoneNumber().phoneNumber();

    @Test
    public void addWaiter() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        createNewWaiterFacade = new CreateNewWaiterFacade(driver);
        createNewEmployee = new CreateNewEmployee(driver);
        signInPage.goToSignInPage();
        signInFacade.signIn(ownerEmail, ownerPassword);
        createNewWaiterFacade.createNewWaiter(name, email, phone, password);
        Assert.assertTrue(createNewEmployee.isEmployeeDisplayed(name), "The waiter has not been added");
    }

    @Test
    public void deleteWaiter() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        createNewWaiterFacade = new CreateNewWaiterFacade(driver);
        waiters = new Waiters(driver);
        signInPage.goToSignInPage();
        signInFacade.signIn(ownerEmail, ownerPassword);
        waiters.clickOnButtonDeleteWaiter();
    }
}
