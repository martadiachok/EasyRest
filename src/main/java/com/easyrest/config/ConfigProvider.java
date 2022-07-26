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
    String loginPageUrlMac = readConfig.getString("url.logInPageUrl.urlLoginMac");
    String signUpPageUrlMac = readConfig.getString("url.signUpPageUrl.signUpPageUrlMac");

}
