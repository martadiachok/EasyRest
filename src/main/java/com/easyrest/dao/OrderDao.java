package com.easyrest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDao {
    public static final String USER_ID_BY_EMAIL_QUERY = "SELECT id " +
            "FROM users " +
            "WHERE email=?";
    public static final String RESTAURANT_ID_BY_ADMINISTRATOR_ID_QUERY = "SELECT id " +
            "FROM restaurants " +
            "WHERE administrator_id=?";
    public static final String INSERT_WAITING_FOR_CONFIRM_ORDER_QUERY = "INSERT " +
            "INTO orders(status,user_id,rest_id) " +
            "VALUES ('Waiting for confirm','27',?) " +
            "RETURNING id";
    public static final String INSERT_ACCEPTED_ORDER_QUERY = "INSERT " +
            "INTO orders(status,user_id,rest_id) " +
            "VALUES ('Accepted','27',?) " +
            "RETURNING id";
    public static final String DELETE_ORDER_QUERY = "DELETE " +
            "FROM orders " +
            "WHERE id=?";

    public int saveWaitingForConfirmOrder(String email) {
        int administratorId = 0;
        int restaurantId = 0;
        int insertedOrderId = 0;
        try (Connection connection = DBManager.openConnection()) {
            try (PreparedStatement administratorIdStatement = connection.prepareStatement(USER_ID_BY_EMAIL_QUERY)) {
                administratorIdStatement.setString(1, email);
                ResultSet administratorResultSet = administratorIdStatement.executeQuery();
                while (administratorResultSet.next()) {
                    administratorId = administratorResultSet.getInt("id");
                }
            }
            try (PreparedStatement restaurantIdStatement = connection.prepareStatement(RESTAURANT_ID_BY_ADMINISTRATOR_ID_QUERY)) {
                restaurantIdStatement.setInt(1, administratorId);
                ResultSet restaurantResultSet = restaurantIdStatement.executeQuery();
                while (restaurantResultSet.next()) {
                    restaurantId = restaurantResultSet.getInt("id");
                }
            }
            try (PreparedStatement addOrderStatement = connection.prepareStatement(INSERT_WAITING_FOR_CONFIRM_ORDER_QUERY)) {
                addOrderStatement.setInt(1, restaurantId);
                ResultSet addOrderResultSet = addOrderStatement.executeQuery();
                while (addOrderResultSet.next()) {
                    insertedOrderId = addOrderResultSet.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insertedOrderId;
    }

    public int saveAcceptedOrder(String email) {
        int administratorId = 0;
        int restaurantId = 0;
        int insertedOrderId = 0;
        try (Connection connection = DBManager.openConnection()) {
            try (PreparedStatement administratorIdStatement = connection.prepareStatement(USER_ID_BY_EMAIL_QUERY)) {
                administratorIdStatement.setString(1, email);
                ResultSet administratorResultSet = administratorIdStatement.executeQuery();
                while (administratorResultSet.next()) {
                    administratorId = administratorResultSet.getInt("id");
                }
            }
            try (PreparedStatement restaurantIdStatement = connection.prepareStatement(RESTAURANT_ID_BY_ADMINISTRATOR_ID_QUERY)) {
                restaurantIdStatement.setInt(1, administratorId);
                ResultSet restaurantResultSet = restaurantIdStatement.executeQuery();
                while (restaurantResultSet.next()) {
                    restaurantId = restaurantResultSet.getInt("id");
                }
            }
            try (PreparedStatement addOrderStatement = connection.prepareStatement(INSERT_ACCEPTED_ORDER_QUERY)) {
                addOrderStatement.setInt(1, restaurantId);
                ResultSet addOrderResultSet = addOrderStatement.executeQuery();
                while (addOrderResultSet.next()) {
                    insertedOrderId = addOrderResultSet.getInt(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insertedOrderId;
    }

    public void deleteOrder(int id) {
        try (Connection connection = DBManager.openConnection();
             PreparedStatement deleteOrderStatement = connection.prepareStatement(DELETE_ORDER_QUERY)) {
            deleteOrderStatement.setInt(1, id);
            deleteOrderStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
