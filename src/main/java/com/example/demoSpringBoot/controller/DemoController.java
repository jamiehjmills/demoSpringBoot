package com.example.demoSpringBoot.controller;

import com.example.demoSpringBoot.FirstName;
import com.example.demoSpringBoot.entity.Employee;
import com.example.demoSpringBoot.entity.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    FirstName firstName;

    Employee employees;

    EmployeeRepo db;

    int id = 0;

    @GetMapping("/hello")
    //@ResponseBody
    public void response(@RequestParam String lastName){

        id++;

        this.employees = new Employee(id, firstName.getFirstName(), "test", lastName);
        db.save(employees);

        System.out.println(id +" "+ firstName.getFirstName() + " " + lastName);
    }


}
