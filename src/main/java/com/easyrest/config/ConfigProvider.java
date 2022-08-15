package com.easyrest.config;

import com.typesafe.config.Config; // бібліотека typesafe дозволяє через точку спускатися вниз по конфігурації
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config readConfig  = readConfig();

    static Config readConfig() {
        return ConfigFactory.load("properties.conf");
    }

    String clientEmail = readConfig.getString("usersParams.client.email");
    String clientPassword = readConfig.getString("usersParams.client.password");
    String logInPageUrl = readConfig.getString("url.logInPageUrl");
    String signUpPageUrl = readConfig.getString("url.signUpPageUrl");
    String adminPageUrl = readConfig().getString("url.adminPageUrl");

    /**
     * Read TestData
     */

    String testEmail = readConfig.getString("testData.email");
    String testName = readConfig.getString("testData.name");
    String testPhoneNumber = readConfig.getString("testData.phoneNumber");
    String testBirthDate = readConfig.getString("testData.birthDate");
    String testBirthMonth = readConfig.getString("testData.birthMonth");
    String testBirthYear = readConfig.getString("testData.birthYear");
    String testPassword = readConfig.getString("testData.password");

}
