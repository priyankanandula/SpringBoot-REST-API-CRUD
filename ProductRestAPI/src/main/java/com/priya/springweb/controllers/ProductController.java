package com.priya.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.priya.springweb.entities.Product;
import com.priya.springweb.repos.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository repository;

	@RequestMapping(value="/products",method=RequestMethod.GET)
	public List<Product> getProducts(){
		
		return repository.findAll();
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Product getProductById(@PathVariable("id") int id) {
		
		return repository.findById(id).get();
		
	}
	
	@RequestMapping(value="/products/",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		
		return repository.save(product);
	}
	
	
	@RequestMapping(value="/products/",method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		
		return repository.save(product);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void  deleteProduct(@PathVariable("id") int id) {
		
	repository.deleteById(id);
		
	}
}
