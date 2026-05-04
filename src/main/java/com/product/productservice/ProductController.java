package com.product.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductDAOServiceImpl productDAOServiceImpl;

	@GetMapping("/products")
	public List<Product> getAllProducts() {

		return productDAOServiceImpl.getAllProducts();
	}
	@GetMapping("/")
	public String getAllProduct() {

		return "Welcome to AWS";
	}

	@GetMapping(" /products/{id}")
	public Product getProductById(@PathVariable int id) {
         
		return productDAOServiceImpl.getProductById(id);
	}

}
