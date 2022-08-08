package com.easyrest.facade;

import com.easyrest.components.Header;
import com.easyrest.components.UserRoleMenuPanel;
import com.easyrest.pages.SignInPage;
import org.openqa.selenium.WebDriver;

public class AuthorizedHeaderMenuPanelFacade {
    private WebDriver driver;

    private Header headerMenu;
    private UserRoleMenuPanel rolePanel;

    public AuthorizedHeaderMenuPanelFacade(WebDriver driver)
    {
        headerMenu = new Header(driver);
        rolePanel = new UserRoleMenuPanel(driver);

        this.driver = driver;
    }

    public void clickOnTheFirstMenuItem()
    {
        headerMenu.clickOnUserProfileIcon();
        rolePanel.clickOnTheFirstMenuItem();
    }

    public SignInPage clickOnLogoutMenuItem() {
        headerMenu.clickOnUserProfileIcon();
        rolePanel.clickOnLogOutMenuItem();

        return new SignInPage(driver);
    }

}
