package com.easyrest.pages.adminPanel;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.admin.CreateModeratorAccountForm;
import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Moderators_AdminPanel extends BasePage {

    private final By addModeratorButton = By.xpath("//span[text()='Add moderator']");

    public Moderators_AdminPanel(WebDriver driver) { super(driver); }

    public void clickOnCreateModerator(){
        driver.findElement(addModeratorButton).click();
    }

    public Moderators_AdminPanel goToAdminPanel_ModeratorPage(){
        openPage(ConfigProvider.adminPanelModeratorsUrl);
        return this;
    }

}
