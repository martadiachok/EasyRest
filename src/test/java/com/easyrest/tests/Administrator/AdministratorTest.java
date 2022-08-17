package com.easyrest.tests.Administrator;

import com.easyrest.facade.AdministratorOperationsFacade;
import com.easyrest.facade.AuthorizedHeaderMenuPanelFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdministratorTest extends BaseTest {

    private final String email = "seanchoi@test.com";
    private final String password = "1";

    @Test
    public void acceptWaitingForConfirmOrder() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage
                .goToSignInPage()
                .inputEmail(email)
                .inputPassword(password)
                .clickSignIn();

        AdministratorOperationsFacade administrator = new AdministratorOperationsFacade(driver);
        Integer ordersCountBeforeAccepting = administrator.seeWaitingForConfirmOrdersCount();
        administrator.acceptOrder();
        Integer ordersCountAfterAccepting = administrator.seeWaitingForConfirmOrdersCount();

        AuthorizedHeaderMenuPanelFacade menu = new AuthorizedHeaderMenuPanelFacade(driver);
        menu.clickOnLogoutMenuItem();

        Assert.assertEquals(ordersCountAfterAccepting, ordersCountBeforeAccepting - 1, "Order was not accepted");
    }

}
