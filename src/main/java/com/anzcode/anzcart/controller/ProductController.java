package com.anzcode.anzcart.controller;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.anzcode.anzcart.models.Product;
import com.anzcode.anzcart.services.ProductSrevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductSrevice productService;
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	
	}
	@GetMapping("/category")
    public List<Map<String,Object>> getCategoryProducts() {
	 return Arrays.asList(
		    Map.of("name","product 1", "price" , 234),
			Map.of("name","product 2", "price" , 134)
			 );
 }
}