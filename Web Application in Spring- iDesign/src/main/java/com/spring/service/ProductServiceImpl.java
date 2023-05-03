package com.spring.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductDAO;
import com.spring.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
	private ProductDAO dao;

	public ArrayList<Product> returnList() {
		
		return dao.returnList();

	}
	
}
