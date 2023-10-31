package com.green.day24;

import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConn {
    public static final String DB_URL ="jdbc:mariadb://localhost:3306/board_ver1";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "green502";

    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (Exception e) {
            System.out.println("이상해");
           e.printStackTrace();
        }
        System.out.println("이상무");
        return conn;
    }
}
