package com.easyrest.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModeratorPanel extends BasePage {

    private final By restaurantsListMenuItem = By.xpath("//span [text()='Restaurants List']");
    private final By homeMenuItem = By.xpath("//span [text() = 'Home']");
    private final By easyRestMenuItem = By.xpath("//a [text() = 'Easy-rest']");

    private final By restaurantsMenuButton = By.xpath("// span [contains (text(), 'Restaurants')]/parent::div");
    private final By userMenuItem = By.xpath("//div [contains (@class, 'UserMenu-avatar')]");
    private final By moderatorPanelUserMenu = By.xpath("//a [@href= '/moderator' ]");
    private final By restaurantsAllMenuItem = By.xpath("// span [contains (text(), 'All')]");
    private final By restaurantsUnapprovedMenuItem = By.xpath("// span [contains (text(), 'Unapproved ')]");
    private final By restaurantsApprovedMenuItem = By.xpath("// span [contains (text(), 'Approved ')]");
    private final By restaurantsArchivedMenuItem = By.xpath("//span [contains (text(), 'Archived')]/parent::span");
    private final By approveButton = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [text() = 'Approve']");
    private final By disapproveButton = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [text() = 'Disapprove']");
    private final By archiveButton = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [text() = 'Delete']");
    private final By restoreButton = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [text() = 'Restore']");

    private final By usersMenuButton = By.xpath("//span [text() = 'Users']");
    private final By allMenuItem = By.xpath("//span [contains (text() , 'All ')]");
    private final By activeMenuItem = By.xpath("//span [contains (text() , 'Active ')]");
    private final By bannedMenuItem = By.xpath("//span [contains (text() , 'Banned ')]");

    private final By actionsIconButton = By.cssSelector("td:nth-child(6)");
    private final By ownersMenuButton = By.xpath("//span [text() = 'Owners']");

    public ModeratorPanel(WebDriver driver) {
        super(driver);
    }

    public ModeratorPanel clickOnMenuItemRestaurantList() {

        driver.findElement(restaurantsListMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemHome() {

        driver.findElement(easyRestMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemEasyRest() {

        driver.findElement(homeMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuButtonRestaurants() {

        driver.findElement(restaurantsMenuButton).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemUser() {
        driver.findElement(userMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnUserMenuModeratorPanel() {

        driver.findElement(moderatorPanelUserMenu).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemRestaurantsAll() {

        driver.findElement(restaurantsAllMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemRestaurantsUnapproved() {

        driver.findElement(restaurantsUnapprovedMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemRestaurantsApproved() {

        driver.findElement(restaurantsApprovedMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemRestaurantsArchived() {

        driver.findElement(restaurantsArchivedMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnButtonApprove() {

        driver.findElement(approveButton).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnButtonDisapprove() {

        driver.findElement(disapproveButton).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnButtonArchive() {

        driver.findElement(archiveButton).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnButtonRestore() {

        driver.findElement(restoreButton).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuButtonUsers() {

        driver.findElement(usersMenuButton).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemAll() {

        driver.findElement(allMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemActive() {

        driver.findElement(activeMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuItemBanned() {

        driver.findElement(bannedMenuItem).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnIconButtonActions() {

        driver.findElement(actionsIconButton).click();
        return new ModeratorPanel(driver);
    }

    public ModeratorPanel clickOnMenuButtonOwners() {

        driver.findElement(ownersMenuButton).click();
        return new ModeratorPanel(driver);
    }

}
