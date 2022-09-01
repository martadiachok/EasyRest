package com.easyrest.dao;

import com.easyrest.config.ConfigProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    private static final String host = ConfigProvider.host;
    private static final String user = ConfigProvider.user;
    private static final String password = ConfigProvider.password;

    public static Connection openConnection() {
        try {
            return DriverManager.getConnection(host, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
