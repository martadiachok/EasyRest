package com.easyrest.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config readConfig = readConfig();

    static Config readConfig() {
        return ConfigFactory.load("properties.conf");
    }

    /**
     * Read UsersParam
     */
    String clientEmail = readConfig.getString("usersParams.client.email");
    String clientPassword = readConfig.getString("usersParams.client.password");

    String adminEmail = readConfig.getString("usersParams.admin.email");
    String adminPassword = readConfig.getString("usersParams.admin.password");

    String ownerEmail = readConfig.getString("usersParams.owner.email");
    String ownerPassword = readConfig.getString("usersParams.owner.password");

    String moderatorEmail = readConfig.getString("usersParams.moderator.email");
    String moderatorPassword = readConfig.getString("usersParams.moderator.password");

    String administratorEmail = readConfig.getString("usersParams.administrator.email");
    String administratorPassword = readConfig.getString("usersParams.administrator.password");

    String waiterEmail = readConfig.getString("usersParams.waiter.email");
    String waiterPassword = readConfig.getString("usersParams.waiter.password");


    String fakeEmail = readConfig.getString("fakeData.email");
    String fakePassword = readConfig.getString("fakeData.email");

    /**
     * Read URL
     */
    String logInPageUrl = readConfig.getString("url.generalUrl.logInPageUrl");
    String signUpPageUrl = readConfig.getString("url.generalUrl.signUpPageUrl");
    String signInPageUrl = readConfig.getString("url.generalUrl.logInPageUrl");

    String adminPageUrl = readConfig().getString("url.adminUrl.adminPanelUrl");
    String adminPanelOwnersUrl = readConfig().getString("url.adminUrl.adminPanelOwnersUrl");
    String adminPanelModeratorsUrl = readConfig().getString("url.adminUrl.adminPanelModeratorsUrl");
    String adminPanelUsersUrl = readConfig().getString("url.adminUrl.adminPanelUsersUrl");
    String adminPanelRestaurantUrl = readConfig().getString("url.adminUrl.adminPanelRestaurantUrl");

    String administratorPanelUrl = readConfig().getString("url.administratorUrl.administratorPanelUrl");
    String alertMessage = readConfig().getString("loginAlert.message");

}
