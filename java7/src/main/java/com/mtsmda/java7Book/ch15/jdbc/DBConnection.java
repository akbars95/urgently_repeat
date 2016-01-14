package com.mtsmda.java7Book.ch15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by MTSMDA on 14.01.2016.
 */
public class DBConnection {

    private static String dbName = "football";
    private static String url = "jdbc:mysql://localhost:3306/" + dbName;
    private static String username = "root";
    private static String password = "root";

    private static Connection connection;

    private DBConnection() {

    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}