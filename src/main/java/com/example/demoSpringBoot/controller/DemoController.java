package com.example.demoSpringBoot.controller;

import com.example.demoSpringBoot.FirstName;
import com.example.demoSpringBoot.entity.Customer;
import com.example.demoSpringBoot.entity.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    FirstName firstName;

    Customer customer;

    @Autowired
    CustomerRepo db;

    int id = 0;

    @GetMapping("/hello")
    //@ResponseBody
    public void response(@RequestParam String lastName){

        id++;

        this.customer = new Customer(id, firstName.getFirstName(), "test", lastName);
        db.save(customer);

        //System.out.println(id +" "+ firstName.getFirstName());

        System.out.println(lastName + " " + firstName.getFirstName()); //<-- this works!
    }


}
