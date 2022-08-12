package com.easyrest.components.owner;

import com.easyrest.components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewEmployee extends BaseComponent {
    private WebDriver driver;
    private final By nameField = By.xpath("//input[@name='name']");
    private final By mailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By phoneField = By.xpath("//input[@name='phone_number']");
    private final By addButton = By.xpath("//*[text() = 'Add']");
    private final By cancelButton = By.xpath("//*[text() = 'Cancel']");

    public CreateNewEmployee(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public CreateNewEmployee sendToFieldName(String name) {
        clearWithKeysAndFillInput(nameField, name);
        return new CreateNewEmployee(driver);
    }

    public CreateNewEmployee sendToFieldMail(String email) {
        clearWithKeysAndFillInput(mailField, email);
        return new CreateNewEmployee(driver);
    }

    public CreateNewEmployee sendToFieldPassword(String password) {
        clearWithKeysAndFillInput(passwordField, password);
        return new CreateNewEmployee(driver);
    }

    public CreateNewEmployee sendToFieldPhone(String phone) {
        clearWithKeysAndFillInput(phoneField, phone);
        return new CreateNewEmployee(driver);
    }

    public void clickOnButtonAdd() {
        driver.findElement(addButton).click();
    }

    public void clickOnButtonCancel() {
        driver.findElement(cancelButton).click();
    }


}
