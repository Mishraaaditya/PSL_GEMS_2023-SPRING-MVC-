package com.spring.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.ui.Model;

import com.spring.dao.ProductDAO;
import com.spring.dao.ProductDAOImpl;
import com.spring.entity.Product;
import com.spring.service.ProductService;


@Controller

public class ProductController {
    
    @Autowired
    private ProductService obj;
    @RequestMapping("/")
//     public ModelAndView index(ModelMap model){

//     ModelAndView mav = new ModelAndView();
//     ArrayList<Product> productList = new ArrayList<>() ;
//     productList=obj.returnList();
//    model.addAttribute("productList", productList);
//     mav.setViewName("home");
//     return mav; 
		
		

// 	}
public String index(ModelMap model){

    ArrayList<Product> productList = new ArrayList<>() ;
    productList=obj.returnList();
   model.addAttribute("productList", productList);
   return "home";
    }
}