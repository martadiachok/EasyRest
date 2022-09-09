package com.easyrest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RestaurantDao {

    public static final String DELETE_RESTAURANT_QUERY = "DELETE " +
            "FROM restaurants " +
            "WHERE name='test'";

    public void deleteRestaurant() {
        try (Connection connection = DBManager.openConnection();
             PreparedStatement deleteRestaurantStatement = connection.prepareStatement(DELETE_RESTAURANT_QUERY)) {
            deleteRestaurantStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
