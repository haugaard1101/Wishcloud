package com.example.wishcloud.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {


    //Variabler
    private static String hostname;
    private static String username;
    private static String password;
    private static Connection connection;

    //Metoder

    public static Connection getConnection(){
        hostname = "jdbc:mysql://onskeskyen.mysql.database.azure.com/ønskeliste";
        username = "Glennhansen";
        password = "Benjamin1";

        try {
            connection = DriverManager.getConnection(hostname,username,password);

        } catch (SQLException e) {
            System.out.println("Kan ikke forbinde til database");
            throw new RuntimeException(e);
        }
        System.out.println("Forbindelse til database godkendt!");
        return connection;
    }
}
