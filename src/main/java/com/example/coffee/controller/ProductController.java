package com.example.coffee.controller;

import com.example.coffee.model.Product;
import com.example.coffee.service.DefaultProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private final DefaultProductService productService;

    public ProductController(DefaultProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String productsPage(Model model) {
        List<Product> products = productService.getAllproducts();
        model.addAttribute("products", products);
        return "product-list";
    }
}
