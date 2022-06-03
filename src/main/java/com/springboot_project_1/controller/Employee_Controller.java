package com.springboot_project_1.controller;

import com.springboot_project_1.model.Employee;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
public class Employee_Controller {
    ArrayList<Employee> EmployeeList = new ArrayList<>();

    @RequestMapping("/add_Employee")

    public String addMethod(@RequestBody Employee Employee1) {
        // Employee Employee1  = new Employee("Ritz","E1","CS");
        EmployeeList.add(Employee1);

        return "Employee data add successfully";

    }

    @RequestMapping("/get_Employee")
    public ArrayList<Employee> getEmployee() {
        return EmployeeList;
    }

    @RequestMapping("/update_Employee/{name}")
    public String update_Employee(@PathVariable String name) {
        EmployeeList.get(1).setName(name);
        return "Update Employee Data Successfully" + name;
    }

    @RequestMapping("/remove_Employee")
    public String Remove_Employee(@RequestParam int index) {
        EmployeeList.remove(index);
        return "remove data in Employee" + index;
    }


}