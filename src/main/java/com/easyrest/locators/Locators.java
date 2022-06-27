package com.easyrest.locators;

import org.openqa.selenium.By;

public enum Locators {

    INPUT_EMAIL_FIELD(By.xpath("/html/body/div/main/div/div[2]/form/div/div[1]/div/div/input")),
    INPUT_PASSWORD_FIELD(By.xpath("/html/body/div/main/div/div[2]/form/div/div[2]/div/div/input")),
    BUTTON_SING_IN(By.xpath("/html/body/div/main/div/div[2]/form/div/div[3]/div/button/span[1]"));
    private final By path;

    Locators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
