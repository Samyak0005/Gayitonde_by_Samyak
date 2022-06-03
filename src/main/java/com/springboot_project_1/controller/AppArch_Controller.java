package com.springboot_project_1.controller;

import com.springboot_project_1.Service.APPArchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppArch_Controller {
    @Autowired
    APPArchService obj;
    @RequestMapping("/response")
    public String response(){
        return obj.response();

    }
}
