package com.priya.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priya.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
