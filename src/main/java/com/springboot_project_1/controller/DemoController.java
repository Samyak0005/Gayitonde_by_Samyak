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
        // loop
    @RequestMapping("/checkit")
        public String Loop1() {
        int[] marks ={23,34,54,50};
        for (int var: marks){
            return "Element  "+var;
        }
        //for (int i = 0; i <= 10; i++) {
          //  return "print num  " + i;
        //}
return "checkit";
    }
    }

