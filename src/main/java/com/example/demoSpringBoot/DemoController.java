package com.example.demoSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    FirstName firstName;

    @GetMapping("/hello")
    public void response(@RequestParam String lastName){

        System.out.println(firstName.getFirstName() + " " + lastName);
    }


}
