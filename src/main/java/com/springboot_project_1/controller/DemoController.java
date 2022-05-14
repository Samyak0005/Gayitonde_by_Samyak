package com.springboot_project_1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// step 1 use this annotation on the top the class
public class DemoController {
    // Method to print anything you want in Spring boot console
    @RequestMapping("/WELCOME")// step 2 use this annotation to create end point
    public void Gaitonde(){
        System.out.println("Gaitonde is villain");
    }
    //print out the Browser
    @RequestMapping("/hello")

    public String Samyak(){

        return "HEYY THIS SIDE GAITONDE";
    }
    @RequestMapping("/Add_Integar_value")


    public int M1() {
     //   System.out.println("add");

            int a = 23;
            int b = 24;
            return a + b;
        }
    }

