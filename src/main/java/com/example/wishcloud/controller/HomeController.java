package com.example.wishcloud.controller;


import com.example.wishcloud.service.ØnskeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class HomeController {

    ØnskeService ønskeService = new ØnskeService();


    @GetMapping("/")
    public String homePage(){
        return "HomePage";
    }

    @PostMapping("/createwish")
    public String createWish(WebRequest request){
        ønskeService.createWish(request);
        return "/createWish";
    }
}
