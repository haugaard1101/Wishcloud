package com.example.wishcloud.model;

public class Wishlist {

    private String name;
    private String description;

    public Wishlist(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
