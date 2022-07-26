package com.easyrest.config;

import com.typesafe.config.Config; // бібліотека typesafe дозволяє через точку спускатися вниз по конфігурації
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config readConfig  = readConfig();

    static Config readConfig() {
        return ConfigFactory.load("properties.conf");
    }

    String urlMac = readConfig.getString("urlHomePageMac");
    String urlWind = readConfig.getString("urlHomePageWind");

    String urlLoginMac = readConfig.getString("urlLoginMac");
    String urlLoginWind = readConfig.getString("urlLoginWind");

    String urlRestaurantsMac = readConfig.getString("urlRestaurantsMac");
    String urlRestaurantsWind = readConfig.getString("urlRestaurantsWind");

    String clientEmail = readConfig.getString("usersParams.client.email");
    String clientPassword = readConfig.getString("usersParams.client.password");
    String loginPageUrlMac = readConfig.getString("URL.logInPageUrl.urlLoginMac");
    String signUpPageUrlMac = readConfig.getString("URL.signUpPageUrl.signUpPageUrlMac");

}
