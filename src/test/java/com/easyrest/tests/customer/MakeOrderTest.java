package com.easyrest.tests.customer;

import com.easyrest.components.menuPage.OrderConfirmation;
import com.easyrest.config.ConfigProvider;
import com.easyrest.constants.Constants;
import com.easyrest.facade.MakeOrderFacade;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MakeOrderTest extends BaseTest {
    private SignInFacade signInFacade;
    private SignInPage signInPage;
    private WebDriverWait wait;
    private MakeOrderFacade makeOrderFacade;
    private OrderConfirmation orderConfirmation;
    private final String clientEmail = ConfigProvider.clientEmail;
    private final String clientPassword = ConfigProvider.clientPassword;

    @BeforeMethod
    public void goToSignInPage() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TimeoutVariable.IMPLICIT_WAIT));
        signInPage.goToSignInPage();
        signInFacade.signIn(clientEmail, clientPassword);
    }

    @Test
    public void makeOrder(){
        makeOrderFacade = new MakeOrderFacade(driver);
        orderConfirmation = new OrderConfirmation(driver);
        makeOrderFacade.makeOrder();
        wait.until(ExpectedConditions.presenceOfElementLocated(orderConfirmation.getConfirmationMessage()));
        Assert.assertTrue(orderConfirmation.checkIfOrderWasMade());
    }
}
