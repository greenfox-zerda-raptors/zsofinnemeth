package com.greenfoxacademy.domain.repository;

import com.greenfoxacademy.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByName(String name);
}
