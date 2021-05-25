package com.nemana.controller;

import com.nemana.model.Customer;
import com.nemana.service.CustomerService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cust")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public String sayHello() {
        System.out.println("Inside controller sayHello");
        return "Hello World";
    }


    @GetMapping("/all")
    public List<Customer> getCustomers() {
        System.out.println("Inside controller");
        List<Customer> customers = customerService.getAllCustomers();
        System.out.println("Returning list:-"+customers);
        return customers;
    }

    @PostMapping("/add")
    public List<Customer> addCustomer(@RequestBody Customer customer) {
        System.out.println("Inside add customer in controller");
        customerService.addCustomer(customer);
        return getCustomers();
    }
}
