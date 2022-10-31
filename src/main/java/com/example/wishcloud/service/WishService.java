package com.example.wishcloud.service;

import com.example.wishcloud.model.Wish;
import com.example.wishcloud.model.Wishlist;
import com.example.wishcloud.repository.WishRepository;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

public class WishService {

    WishRepository repo = new WishRepository();


    public void createWish(WebRequest request) {
        Wish wish = new Wish(request.getParameter("wish_id"), request.getParameter("Product_name"),
                request.getParameter("Product_description"), request.getParameter("Product_price"),
                request.getParameter("Product_link"));
        repo.createWish(wish);

    }

    public void createWishlist(WebRequest request) {
        Wishlist wishlist = new Wishlist(request.getParameter("wishlist_name"),
                request.getParameter("wishlist_description"));
        repo.createWishlist(wishlist);

    }

    public List<Wish> getWishlist() {
        return repo.getWishlist();

    }
    public String getWishlistName() {
        return repo.getWishlistName();

    }
}