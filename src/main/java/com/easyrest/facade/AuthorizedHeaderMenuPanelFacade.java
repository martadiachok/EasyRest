package com.easyrest.facade;

import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.UserRoleMenuPanel;
import com.easyrest.pages.SignInPage;
import org.openqa.selenium.WebDriver;

public class AuthorizedHeaderMenuPanelFacade {
    private WebDriver driver;

    private HeaderForAuthorizedUser headerForAuthorizedUserMenu;
    private UserRoleMenuPanel rolePanel;

    public AuthorizedHeaderMenuPanelFacade(WebDriver driver)
    {
        headerForAuthorizedUserMenu = new HeaderForAuthorizedUser(driver);
        rolePanel = new UserRoleMenuPanel(driver);

        this.driver = driver;
    }

    public void clickOnTheFirstMenuItem()
    {
        headerForAuthorizedUserMenu.clickOnUserProfileIcon();
        rolePanel.clickOnTheFirstMenuItem();
    }

    public SignInPage clickOnLogoutMenuItem() {
        headerForAuthorizedUserMenu.clickOnUserProfileIcon();
        rolePanel.clickOnLogOutMenuItem();

        return new SignInPage(driver);
    }

}
