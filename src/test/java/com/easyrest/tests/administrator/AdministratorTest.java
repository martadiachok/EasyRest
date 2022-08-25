package com.easyrest.tests.administrator;

import com.easyrest.facade.AdministratorOperationsFacade;
import com.easyrest.facade.AuthorizedHeaderMenuPanelFacade;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.easyrest.config.ConfigProvider.administratorEmail;
import static com.easyrest.config.ConfigProvider.administratorPassword;
import static com.easyrest.constants.Constants.AdministratorTabMenu.*;

public class AdministratorTest extends BaseTest {
    private AdministratorOperationsFacade administrator;

    @BeforeMethod
    public void signIn() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.goToSignInPage();
        SignInFacade signInFacade = new SignInFacade(driver);
        signInFacade.signIn(administratorEmail, administratorPassword);
        administrator = new AdministratorOperationsFacade(driver);
    }

    @Test
    public void acceptWaitingForConfirmOrder() {
        Integer ordersCountBeforeAccepting = administrator.seeWaitingForConfirmOrdersCount();
        administrator.acceptOrder();
        Integer ordersCountAfterAccepting = administrator.seeWaitingForConfirmOrdersCount();

        Assert.assertEquals(ordersCountAfterAccepting, ordersCountBeforeAccepting - 1, "Order is not accepted");
    }

    @Test
    public void assignWaiterForAcceptedOrder() {
        Integer ordersCountBeforeAssigning = administrator.seeAcceptedOrdersCount();
        administrator.assignWaiter();
        Integer ordersCountAfterAssigning = administrator.seeAcceptedOrdersCount();

        Assert.assertEquals(ordersCountAfterAssigning, ordersCountBeforeAssigning - 1, "Waiter is not assigned");
    }

    @Test
    public void seeWaitingForConfirmOrders() {
        administrator.seeWaitingForConfirmOrders();
        String actualTab = administrator.seeWhichTabIsOpen();

        Assert.assertEquals(actualTab, WAITING_FOR_CONFIRM_TAB, "The wrong tab is open");
    }

    @Test
    public void seeAcceptedOrders() {
        administrator.seeAcceptedOrders();
        String actualTab = administrator.seeWhichTabIsOpen();

        Assert.assertEquals(actualTab, ACCEPTED_TAB, "The wrong tab is open");
    }

    @Test
    public void seeAssignedWaiterOrders() {
        administrator.seeAssignedWaitersOrders();
        String actualTab = administrator.seeWhichTabIsOpen();

        Assert.assertEquals(actualTab, ASSIGNED_WAITER_TAB, "The wrong tab is open");
    }

    @Test
    public void seeWaiters() {
        administrator.seeWaiters();
        String actualTab = administrator.seeWhichTabIsOpen();

        Assert.assertEquals(actualTab, WAITERS_TAB, "The wrong tab is open");
    }

    @AfterMethod
    public void logOut() {
        AuthorizedHeaderMenuPanelFacade menu = new AuthorizedHeaderMenuPanelFacade(driver);
        menu.clickOnLogoutMenuItem();
    }

}
