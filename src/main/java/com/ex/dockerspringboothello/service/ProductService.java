package com.ex.dockerspringboothello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.dockerspringboothello.dao.ProductRepo;
import com.ex.dockerspringboothello.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;

	public List<Product> getAll(){
		return repo.getAll();
	}
	
	public List<Product> getByName(String name){
		return repo.getByName(name);
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public void delete(Product product) {
		repo.delete(product);
	}
}
