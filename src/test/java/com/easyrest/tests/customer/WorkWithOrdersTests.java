package com.easyrest.tests.customer;

import com.easyrest.config.ConfigProvider;
import com.easyrest.constants.Constants;
import com.easyrest.facade.OperationsWithOrderFacade;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.pages.customerPanel.CurrentOrders;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class WorkWithOrdersTests extends BaseTest {

    private final String clientEmail = ConfigProvider.clientEmail;
    private final String clientPassword = ConfigProvider.clientPassword;
    private SignInPage signInPage;
    private SignInFacade signInFacade;
    private OperationsWithOrderFacade operationsWithOrderFacade;
    private CurrentOrders currentOrders;
    private WebDriverWait wait;

    @BeforeTest
    public void goToSignInPage(){
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        signInPage.goToSignInPage();
        signInFacade.signIn(clientEmail, clientPassword);
    }

    @Test
    public void seeAllOrders(){
        operationsWithOrderFacade = new OperationsWithOrderFacade(driver);
        operationsWithOrderFacade.seeAllOrders();
        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.customerAllOrders);
    }

    @Test
    public void seeWaitingForConfirmOrders(){
        operationsWithOrderFacade = new OperationsWithOrderFacade(driver);
        operationsWithOrderFacade.seeWaitingForConfirmOrders();
        Assert.assertEquals(driver.getCurrentUrl(),ConfigProvider.customerWaitingForConfirmOrders);
    }

    @Test
    public void seeAcceptedOrders(){
        operationsWithOrderFacade = new OperationsWithOrderFacade(driver);
        operationsWithOrderFacade.seeAcceptedOrders();
        Assert.assertEquals(driver.getCurrentUrl(),ConfigProvider.customerAcceptedOrders);
    }

    @Test
    public void seeInProgressOrders(){
        operationsWithOrderFacade = new OperationsWithOrderFacade(driver);
        operationsWithOrderFacade.seeInProgressOrders();
        Assert.assertEquals(driver.getCurrentUrl(),ConfigProvider.customerInProgressOrders);
    }

    @Test
    public void seeDetailsOfTheOrder(){
        operationsWithOrderFacade = new OperationsWithOrderFacade(driver);
        currentOrders = new CurrentOrders(driver);
        operationsWithOrderFacade.seeInProgressOrders();
        operationsWithOrderFacade.seeDetailsOrder();
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TimeoutVariable.IMPLICIT_WAIT));
        wait.until(ExpectedConditions.presenceOfElementLocated(currentOrders.getDeclineElement()));
        Assert.assertTrue(operationsWithOrderFacade.isElementPresent(currentOrders.getDeclineElement()));
    }

}
