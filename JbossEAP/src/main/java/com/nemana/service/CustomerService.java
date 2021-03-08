package com.nemana.service;

import com.nemana.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {

    public List<Customer> getAllCustomers();

    void addCustomer(Customer customer);
}
