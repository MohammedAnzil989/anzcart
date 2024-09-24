package com.anzcode.anzcart.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anzcode.anzcart.models.Product;
import com.anzcode.anzcart.repository.ProductRepository;

@Service
public class ProductSrevice {
@Autowired
 private ProductRepository productRepository;
 
 
public List<Product> getAllProducts() {
	// TODO Auto-generated method stub
	return productRepository.findAll(); 
}
}
