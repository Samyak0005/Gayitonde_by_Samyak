package com.springboot_project_1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Request_Param_Controller {
    @RequestMapping("/brandname")
    public String Mobile_Name(@RequestParam String name){

        return "Best mobile of the year"+name;
    }
    //calculator
    @RequestMapping("/addition")
    public String Addition(@RequestParam int a, @RequestParam int b) {

        return "Addition"+(a+b);
    }
}
