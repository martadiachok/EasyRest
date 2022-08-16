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

    private Right_sideMenu right_sideMenu;
    private MyRestaurants myRestaurants;
    private AddRestaurant addRestaurant;
    private HeaderForAuthorizedUser headerForAuthorizedUser;
    private UserRoleMenuPanel userRoleMenuPanel;
    private ManageMenu manageMenu;
    private LeftSideMenu leftSideMenu;
    private CreateNewEmployee createNewEmployee;
    private Administrators administrators;
    private Waiters waiters;

    public OwnerPanel(WebDriver driver) {
        super(driver);
        addRestaurant = new AddRestaurant(driver);
        right_sideMenu = new Right_sideMenu(driver);
        myRestaurants = new MyRestaurants(driver);
        headerForAuthorizedUser = new HeaderForAuthorizedUser(driver);
        userRoleMenuPanel = new UserRoleMenuPanel(driver);
        manageMenu = new ManageMenu(driver);
        leftSideMenu = new LeftSideMenu(driver);
        createNewEmployee = new CreateNewEmployee(driver);
        administrators = new Administrators(driver);
        waiters = new Waiters(driver);

    }
}