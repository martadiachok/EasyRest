package com.easyrest.tests.Administrator;

import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.AdministratorOperationsFacade;
import com.easyrest.facade.AuthorizedHeaderMenuPanelFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdministratorTest extends BaseTest {

    private final String email = ConfigProvider.administratorEmail;
    private final String password = ConfigProvider.administratorPassword;

    @BeforeMethod
    public void signIn() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage
                .goToSignInPage()
                .inputEmail(email)
                .inputPassword(password)
                .clickSignIn();
    }

    @Test
    public void acceptWaitingForConfirmOrder() {
        AdministratorOperationsFacade administrator = new AdministratorOperationsFacade(driver);
        Integer ordersCountBeforeAccepting = administrator.seeWaitingForConfirmOrdersCount();
        administrator.acceptOrder();
        Integer ordersCountAfterAccepting = administrator.seeWaitingForConfirmOrdersCount();

        Assert.assertEquals(ordersCountAfterAccepting, ordersCountBeforeAccepting - 1, "Order was not accepted");
    }

    @Test
    public void assignWaiterForAcceptedOrder() {
        AdministratorOperationsFacade administrator = new AdministratorOperationsFacade(driver);
        Integer ordersCountBeforeAssigning = administrator.seeAcceptedOrdersCount();
        administrator.assignWaiter();
        Integer ordersCountAfterAssigning = administrator.seeAcceptedOrdersCount();

        Assert.assertEquals(ordersCountAfterAssigning, ordersCountBeforeAssigning - 1, "Waiter was not assigned");
    }

    @AfterMethod
    public void logOut() {
        AuthorizedHeaderMenuPanelFacade menu = new AuthorizedHeaderMenuPanelFacade(driver);
        menu.clickOnLogoutMenuItem();
    }

}
