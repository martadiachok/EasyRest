package readProperties;

import com.typesafe.config.Config; // бібліотека typesafe дозволяє через точку спускатися вниз по конфігурації
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider { // коли ми дістаємо щось звідкись правильно називати Provider
    Config readConfig  = readConfig();

    static Config readConfig() {
        return ConfigFactory.load("properties.conf");
    }

    String urlMac = readConfig.getString("urlMac");
    String urlWind = readConfig.getString("urlWind");

    String urlLoginMac = readConfig.getString("urlLoginMac");
    String urlLoginWind = readConfig.getString("urlLoginWind");

    String urlRestaurantsMac = readConfig.getString("urlRestaurantsMac");
    String urlRestaurantsWind = readConfig.getString("urlRestaurantsWind");

    String clientEmail = readConfig.getString("usersParams.client.email");
    String clientPassword = readConfig.getString("usersParams.client.password");

}
