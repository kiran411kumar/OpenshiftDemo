package com.nemana.controller;

import com.nemana.entity.Accounts;
import com.nemana.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @GetMapping()
    public String sayHello() {
        System.out.println("Inside controller sayHello");
        return "Hello World";
    }


    @GetMapping("/all")
    public List<Accounts> getCustomers() {
        System.out.println("Inside controller");
        List<Accounts> accounts = accountsService.getAllAccounts();
        System.out.println("Returning list:-"+accounts);
        return accounts;
    }

   /* @PostMapping("/add")
    public List<Customer> addCustomer(@RequestBody Customer customer) {
        System.out.println("Inside add customer in controller");
        customerService.addCustomer(customer);
        return getCustomers();
    }*/
}
