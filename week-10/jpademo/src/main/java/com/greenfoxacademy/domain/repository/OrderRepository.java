package com.greenfoxacademy.domain.repository;


import com.greenfoxacademy.domain.Customer;
import com.greenfoxacademy.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Order findByCustomer(Customer customer);
}
