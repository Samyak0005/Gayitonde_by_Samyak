package com.springboot_project_1.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Mahindra_Emp")
public class Employee {
    @Id
    @GeneratedValue
    Long salary;
    private String name;
    @Column (name = "Room_no")
    private String id;
    private String Dept;
// default Constractors
    public Employee() {
    }

    //Constractous


    public Employee(String name, String id, String dept) {
        this.name = name;
        this.id = id;
        Dept = dept;
    }
    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
