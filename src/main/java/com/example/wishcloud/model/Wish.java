package com.example.wishcloud.model;

public class Wish {
    private String wish_id;
    private String Product_name;
    private String Product_description;
    private String Product_price;
    private String Product_link;


    public Wish(String wish_id, String Product_name, String Product_description, String Product_price, String Product_link) {
        this.wish_id = wish_id;
        this.Product_name = Product_name;
        this.Product_description = Product_description;
        this.Product_price = Product_price;
        this.Product_link = Product_link;

    }

    public String getProduct_link() {
        return Product_link;
    }

    public void setProduct_link(String product_link) {
        Product_link = product_link;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public String getProduct_description() {
        return Product_description;
    }

    public void setProduct_description(String product_description) {
        Product_description = product_description;
    }

    public String getProduct_price() {
        return Product_price;
    }

    public void setProduct_price(String product_price) {
        Product_price = product_price;
    }

    public String getWish_id() {
        return wish_id;
    }

    public void setWish_id(String wish_id) {
        this.wish_id = wish_id;
    }

    @Override
    public String toString() {
        return "Wish{" +
                "title='" + Product_name + '\'' +
                ", productDescription='" + Product_description + '\'' +
                ", price=" + Product_price +
                '}';
    }


}


