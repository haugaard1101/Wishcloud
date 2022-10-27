package com.example.wishcloud.service;

import com.example.wishcloud.model.Ønske;
import com.example.wishcloud.repository.Ønskerepository;
import org.springframework.web.context.request.WebRequest;

public class ØnskeService {

    Ønskerepository ø1 = new Ønskerepository();




    public void createWish(WebRequest request){
        Ønske ønske = new Ønske(request.getParameter("Product_name"), request.getParameter("Product_description"),request.getParameter("Product_price"),request.getParameter("Product_link"));
        ø1.createWish(ønske);

    }
}
