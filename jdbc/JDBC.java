package com.sush.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static boolean createDatabase(String databaseName) {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {
            String query = "CREATE DATABASE " + databaseName;
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean dropDatabase(String databaseName) {
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            String query = "DROP DATABASE " + databaseName;
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean createTable(String databaseName, String sequelQuery) {
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sequelQuery);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean dropTable(String databaseName, String tableName) {
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            String query = "DROP TABLE " + tableName;
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static boolean insertIntoTable(String databaseName, String tableName, String query) {
        String url = "jdbc:mysql://localhost:3306/" + databaseName;
        String username = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}