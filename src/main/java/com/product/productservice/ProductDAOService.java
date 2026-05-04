package com.product.productservice;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ProductDAOService {
	public List<Product> getAllProducts();

	public Product getProductById(int productId);

}
