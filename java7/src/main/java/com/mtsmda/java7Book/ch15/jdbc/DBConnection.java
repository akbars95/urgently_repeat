package com.mtsmda.java7Book.ch15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by MTSMDA on 14.01.2016.
 */
public class DBConnection {

    private static String dbName = "english_quiz";
    private static String urlMYSQL = "jdbc:mysql://localhost:3306/" + dbName;
    private static String urlPOSTGRESQL = "jdbc:postgresql://localhost:5432/" + dbName;
    private static String username = "root";
    private static String password = "root";

    private static String usernamePOSTGRESQL = "jdbcExample";
    private static String passwordPOSTGRESQL = "jdbcExample";

    private static Connection connection;

    private DBConnection() {

    }

    public static Connection getConnection(DB db) throws ClassNotFoundException, SQLException {
        if (connection == null) {
            if(db.equals(DB.MYSQL)){
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(urlMYSQL, username, password);
            }else if(DB.POSTGRESQL.equals(db)){
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(urlPOSTGRESQL, usernamePOSTGRESQL, passwordPOSTGRESQL);
            }else{
                throw new RuntimeException("Which db?");
            }

        }
        return connection;
    }

    public enum DB{
        MYSQL, POSTGRESQL
    }
}