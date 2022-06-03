package com.springboot_project_1.controller;

import com.springboot_project_1.Service.EmployeeDBService;
import com.springboot_project_1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDBController {
    //ADD /Create
    @Autowired

    EmployeeDBService service;

    @RequestMapping("/Employee_Db")
    public String add(@RequestBody Employee Employee1) {
        return "hello";
    }

    //Read
    @GetMapping("/get_all_Employee")

    public List<Employee> getALLEmployee() {

        return service.getAllEmployee();
    }
}
