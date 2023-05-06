package com.spring.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.entity.Product;

//Fill your code here
@Repository
public class ProductDAOImpl implements ProductDAO{
    
    //Fill your code here
    
	
	//Fill your code here
	public ArrayList<Product>getProductList() {
		//Fill your code here
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Washing Machine", 20000.0, "Bosch 6.5Kg Washing Machines", "Laundry Room", "Laundry Room - Appliances"));
        productList.add(new Product("Laptop", 14000.0, "Lenovo Ideapad Core i3", "Conference Room", "Conference Room - Electronics"));
        productList.add(new Product("Laptop", 32000.0, "Hewlett Packard Laptops", "Conference Room", "Conference Room - Electronics"));
        productList.add(new Product("Chair", 540.0, "Recliner", "Living Room", "	Living Room - Furniture"));
        productList.add(new Product("Sofa", 1500.0, "Soft Sofa", "Living Room", "Living Room - Furniture"));
		return productList;
	}
	public ArrayList<Product>findByCategoryAndType(String category,String type ) {
		//Fill your code here
		ArrayList<Product> productFindList = new ArrayList<Product>();
        for (Product product : getProductList()) {
            if (product.getCategory().equalsIgnoreCase(category) && product.getType().equalsIgnoreCase(type)) {
                productFindList.add(product);
            }
        }
        return productFindList;

	}
	
}
