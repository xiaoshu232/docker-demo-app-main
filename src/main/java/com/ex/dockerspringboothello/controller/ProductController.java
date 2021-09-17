package com.ex.dockerspringboothello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.dockerspringboothello.entity.Product;
import com.ex.dockerspringboothello.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/product/{name}")
	public List<Product> getByName(@PathVariable String name){
		return service.getByName(name);
	}

}
