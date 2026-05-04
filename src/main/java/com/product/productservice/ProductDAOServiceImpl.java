package com.product.productservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class ProductDAOServiceImpl implements ProductDAOService {
	ArrayList<Product> list = new ArrayList<Product>();
	{
		Product p = new Product();
		p.setId(1);
		p.setName("Apple");
		p.setDescription("Apple Product");
		p.setPrice(2000.0f);
		p.setImageUrl("www.productservice.com");
		Product p2 = new Product();
		p2.setId(1);
		p2.setName("Apple");
		p2.setDescription("Apple Product");
		p2.setPrice(2000.0f);
		p2.setImageUrl("www.productservice.com");
		list.add(p);
		list.add(p2);

	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		Product p = null;
		for (Product product : list) {
			if (product.getId() == productId)
				p = product;
		}
		return p;
	}

}
