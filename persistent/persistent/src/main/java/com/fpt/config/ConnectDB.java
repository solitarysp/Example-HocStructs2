package com.fpt.config;/*
  By Chi Can Em  12-03-2018
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testproduct", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
