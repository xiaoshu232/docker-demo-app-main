package com.ex.dockerspringboothello.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.ex.dockerspringboothello.entity.Product;

@Repository
public class ProductRepo {
	
	private List<Product> products = new ArrayList<>();
	
	{
		products.add(new Product(1, "Java book", 25.25));
		products.add(new Product(1, "Spring book", 35));
		products.add(new Product(1, "Microservices book", 49.99));
	}
	
	public List<Product> getAll(){
		return products;
	}
	
	public List<Product> getByName(String name) {
		return products.stream().filter(p -> p.getName()
				.contains(name)).collect(Collectors.toList());
	}
	
	public void save(Product product) {
		products.add(product);
	}
	
	public void delete(Product product) {
		products.remove(product);
	}

}
