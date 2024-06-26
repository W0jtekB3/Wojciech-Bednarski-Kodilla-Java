package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManager {

    INSTANCE;                                                  // [1]

    private final Connection conn;                             // [2]

    DbManager() {                                              // [3]
        Properties connectionProps = new Properties();         // [4]
        connectionProps.put("user", "kodilla_user");           // [5]
        connectionProps.put("password", "kodilla_Pass123");    // [6]
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_course" +
                            "?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False" +
                            "&allowPublicKeyRetrieval=true",   // Add this parameter
                    connectionProps);
        } catch (SQLException e) {
            e.printStackTrace(); // Print the stack trace to understand the issue
            throw new ExceptionInInitializerError(e);
        }
    }

    public static DbManager getInstance() {
        return INSTANCE;
    }

    public Connection getConnection() {
        return conn;
    }
}
