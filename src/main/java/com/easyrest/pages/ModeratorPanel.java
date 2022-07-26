package com.easyrest.pages;

import org.openqa.selenium.By;

public class ModeratorPanel {

    By restaurantsListLocator = By.xpath("//span [text()='Restaurants List']");
    By homeLocator = By.xpath("//span [text() = 'Home']");
    By erLocator = By.xpath("//a [text() = 'Easy-rest']");

    By moderatorPanelLocator = By.xpath("//a [@href= '/moderator' ]");
    By restaurantsAllLocator = By.xpath("// span [contains (text(), 'All')]");
    By restaurantsUnapprovedLocator = By.xpath("// span [contains (text(), 'Unapproved ')]");
    By restaurantsApprovedLocator = By.xpath("// span [contains (text(), 'Approved ')]");
    By restaurantsArchivedLocator = By.xpath("//span [contains (text(), 'Archived')]/parent::span");
    By approve  = By.xpath ("//span [text() = 'Approve']");
    By disapprove = By.xpath ("//span [text() = 'Disapprove']");
    By archive = By.xpath ("//span [text() = 'Delete']");
    By restore = By.xpath("//span [text() = 'Restore']");

    By usersMLocator = By.xpath("//span [text() = 'Users']");
    By allLocator  = By.xpath("//span [contains (text() , 'All ')]");
    By activeLocator  = By.xpath("//span [contains (text() , 'Active ')]");
    By bannedLocator  = By.xpath("//span [contains (text() , 'Banned ')]");
    By actionsIconLocator = By.xpath("//* [@class = 'MuiSvgIcon-root-143']/parent::span");

    By ownersLocator = By.xpath("//span [text() = 'Owners']");





}
