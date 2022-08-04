package com.easyrest.tests.waiter;

import com.easyrest.pages.SignInPage;
import com.easyrest.pages.WaiterPage;
import com.easyrest.tests.BaseTest;
import org.testng.annotations.Test;

public class WaiterTest extends BaseTest {

    @Test
    public void verifyWaiterPageWorkCorrectly() {
        SignInPage singInPage = new SignInPage(driver);
        singInPage
                .goToSignInPage()
                .loginValidUser("garyjohnson@test.com", "1");

        WaiterPage waiterPage = new WaiterPage(driver);
        waiterPage
                .clickOnAssignedWaiterOrders()
                .clickOnOrdersHistory()
                .logOut();
    }

}
