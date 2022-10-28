package com.example.wishcloud.controller;


import com.example.wishcloud.repository.WishRepository;
import com.example.wishcloud.service.WishService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

    WishService wishService = new WishService();
    WishRepository repo = new WishRepository();


    @GetMapping("/")
    public String homePage() {
        return "HomePage";
    }

    @PostMapping("/createwish")
    public String createWish(WebRequest request) {
        wishService.createWish(request);
        return "HomePage";
    }
    @PostMapping("/createwishlist")
    public String createWishlist(WebRequest request) {
        wishService.createWishlist(request);
        return "createwish";
    }
    @GetMapping("/createwish")
    public String createWish() {
        return "createwish";
    }
    @GetMapping("/createwishlist")
    public String createWishlist() {
        return "createwishlist";
    }

    @GetMapping("/showwishlist")
    public String getWishlist(Model model) {
        model.addAttribute("wishlist", repo.getWishlist());
        System.out.println(wishService.getWishlist());
        return "showwishlist";
    }
}