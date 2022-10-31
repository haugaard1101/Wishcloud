package com.example.wishcloud.repository;

import com.example.wishcloud.model.Wish;
import com.example.wishcloud.model.Wishlist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WishRepository {

    private Connection connection = DatabaseConnectionManager.getConnection();

    public void createWish(Wish wish) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into ønskeliste (Product_name, Product_description,Product_price,Product_link) values (?,?,?,?)");
            preparedStatement.setString(1, wish.getProduct_name());
            preparedStatement.setString(2, wish.getProduct_description());
            preparedStatement.setString(3, wish.getProduct_price());
            preparedStatement.setString(4, wish.getProduct_link());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void createWishlist(Wishlist wishlist) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update ønskelistenavn set wishlist_name=?, wishlist_description=?");
            preparedStatement.setString(1, wishlist.getName());
            preparedStatement.setString(2, wishlist.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public List<Wish> getWishlist() {
        List<Wish> wishlistArray = new ArrayList<>();

        try {
            PreparedStatement psts = connection.prepareStatement("SELECT * FROM ønskeliste");
            ResultSet resultSet = psts.executeQuery();

            while (resultSet.next()) {
                wishlistArray.add(new Wish(
                        resultSet.getString("wish_id"),
                        resultSet.getString("Product_name"),
                        resultSet.getString("Product_description"),
                        resultSet.getString("Product_price"),
                        resultSet.getString("Product_link")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return wishlistArray;
    }

    public String getWishlistName() {

        String wishlistName;

        try {
            PreparedStatement psts = connection.prepareStatement("SELECT wishlist_name from ønskelistenavn");
            ResultSet resultSet = psts.executeQuery();

            wishlistName = resultSet.getString("wishlist_name");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return wishlistName;
    }
}




