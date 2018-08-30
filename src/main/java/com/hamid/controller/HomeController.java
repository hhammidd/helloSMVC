package com.hamid.controller;

import com.hamid.model.Product;
import com.hamid.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private ProductService productService;
    @RequestMapping(value = "/")
    public List<Product> home(){
        List<Product> a = new ArrayList<Product>();
        a = productService.findAll();

        return a;
    }

}
