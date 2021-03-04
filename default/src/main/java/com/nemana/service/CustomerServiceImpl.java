package com.nemana.service;

import com.nemana.dao.CustomerDao;
import com.nemana.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomers() {
        System.out.println("Inside get all customers");
        return customerDao.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Inside add customer");
        customerDao.save(customer);
    }
}
