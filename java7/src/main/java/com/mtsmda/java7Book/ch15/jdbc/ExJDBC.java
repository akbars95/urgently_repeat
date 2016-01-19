package com.mtsmda.java7Book.ch15.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by MTSMDA on 13.01.2016.
 */
public class ExJDBC {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getConnection(DBConnection.DB.MYSQL);
        System.out.println(connection != null);
        if (connection != null) {
            Statement statement = connection.createStatement();
            System.out.println(statement.getClass().getCanonicalName());
        }
        System.out.println(connection.isClosed());
    }

}