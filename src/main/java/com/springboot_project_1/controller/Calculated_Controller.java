package com.springboot_project_1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculated_Controller {
    @RequestMapping("/add")
    public float add() {
        float a = 1;

        float b = 24;
        return a + b;
    }
        @RequestMapping("/sub")
        public float sub(){
            float a = 23;
            float b=7;
            return a-b;
    }


    @RequestMapping("/mul")
    public float mul(){
        float a = 4;
        float b = 2;
        return a*b;

    }
    @RequestMapping("/div")
    public float div(){
        float a = 4;
        float b = 2;
        return a/b;
    }
}
