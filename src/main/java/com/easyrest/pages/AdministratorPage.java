package com.easyrest.pages;

import com.easyrest.components.administrator.AdministratorMenu;
import org.openqa.selenium.WebDriver;

public class AdministratorPage extends BasePage {

    public AdministratorPage(WebDriver driver) {
        super(driver);
    }

    public AdministratorMenu getAdministratorTabMenu() {
        return new AdministratorMenu(driver);
    }

}
