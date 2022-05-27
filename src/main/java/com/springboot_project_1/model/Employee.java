package com.springboot_project_1.model;

public class Employee {
    private String name;
    private String id;
    private String Dept;

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
