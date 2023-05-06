package com.spring.controller;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.spring.entity.Product;
import com.spring.service.ProductService;

//Fill your code here
@Controller
@RequestMapping("/product")
public class ProductController {    

	//Fill your code here
@Autowired
ProductService ps;

@RequestMapping("/list")
	public String listProducts(Model model) {
		
		
		//Fill your code here
		ArrayList<Product> products = ps.getProductList();
        model.addAttribute("products", products);
        return "list-products";

	}	
	
	
	
	//Fill your code here
@RequestMapping( "/searchProduct")
	public String searchProduct(@RequestParam("category") String category,@RequestParam("type") String type,Model model){
		//Fill your code here
		ArrayList<Product> products = ps.findByCategoryAndType(category, type);
        model.addAttribute("products", products);
        return "list-products";

	}
}