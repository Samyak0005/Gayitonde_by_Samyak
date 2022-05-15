package com.springboot_project_1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Path_Variable {
    @RequestMapping("/agra/{name}")
    public String CityName(@PathVariable String name) {

        return "the city of taj" + name;
    }

    //CALCULATOR
    @RequestMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a,@PathVariable int b) {
        return "Addition  " + (a + b);
    }
        @RequestMapping("/div/{a}/{b}")
    public  String divide(@PathVariable int a,@PathVariable int b){
        return "Divide  "+(a/b);
        }


}

