package com.springboot_project_1.Service;

import com.springboot_project_1.Repository.EmployeeJpaRepository;
import com.springboot_project_1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDBService {

    @Autowired
    EmployeeJpaRepository repository;
    public String add(Employee Employee1){

        repository.save(Employee1);
        return "Successfully Stored in DB";

    }
    public List<Employee> getAllEmployee(){

        return repository.findAll();
    }
}
