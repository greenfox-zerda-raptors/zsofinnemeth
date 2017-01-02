package com.greenfoxacademy.domain.repository;

import com.greenfoxacademy.domain.Customer;
import com.greenfoxacademy.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findByName(String name);
}
