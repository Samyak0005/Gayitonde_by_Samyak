package com.springboot_project_1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "Institude_Student")
public class Students {

    @Id
    @GeneratedValue

    Long id;
    private String name;
    @Column(name = "Room_no")
    private String Section;
    private String age;

    //Default Constructor

    public Students() {
    }


    // parameterized Constructor


    public Students(String name, String section, String age) {
        this.name = name;
        Section = section;
        this.age = age;
    }

    // setter and getter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
