package com.example.wishcloud.repository;

import com.example.wishcloud.model.Ønske;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ønskerepository {

    private Connection connection = DatabaseConnectionManager.getConnection();

    public void createWish(Ønske ønske){

        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into ønske (Product_name, Product_description,Product_price,Product_link) values (?,?,?,?)");
            preparedStatement.setString(1,ønske.getProduct_name());
            preparedStatement.setString(2,ønske.getProduct_description());
            preparedStatement.setString(3,ønske.getProduct_price());
            preparedStatement.setString(4,ønske.getProduct_link());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();        }

    }
}
