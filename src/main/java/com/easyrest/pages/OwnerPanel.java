package com.easyrest.pages;

import com.easyrest.components.AddRestaurant;
import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.UserRoleMenuPanel;
import com.easyrest.components.customer.Right_sideMenu;
import com.easyrest.components.owner.*;
import com.easyrest.pages.customerPanel.CurrentOrders;
import com.easyrest.pages.customerPanel.MyRestaurants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OwnerPanel extends BasePage {

    public Right_sideMenu right_sideMenu;
    public HeaderForAuthorizedUser headerForAuthorizedUser;
    public UserRoleMenuPanel userRoleMenuPanel;
    public ManageMenu manageMenu;
    public LeftSideMenu leftSideMenu;
    public Administrators administrators;
    public Waiters waiters;

    public OwnerPanel(WebDriver driver) {
        super(driver);
        right_sideMenu = new Right_sideMenu(driver);
        headerForAuthorizedUser = new HeaderForAuthorizedUser(driver);
        userRoleMenuPanel = new UserRoleMenuPanel(driver);
        manageMenu = new ManageMenu(driver);
        leftSideMenu = new LeftSideMenu(driver);
        administrators = new Administrators(driver);
        waiters = new Waiters(driver);
    }
}