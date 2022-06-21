package com.springboot_project_1.controller.collection;

import com.springboot_project_1.model.Students;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Student_Controller {

    ArrayList<Students> StudentArrayList = new ArrayList<>();
    @RequestMapping("/add_student")
    public String AddStudentList(@RequestBody Students student){
        StudentArrayList.add(student);

        return "ADD student list successfully";

    }

   @RequestMapping("/get_student")
    public ArrayList<Students> getStudentArrayList(){
        return StudentArrayList;

    }
    @RequestMapping("/update")
    public String UpdateStudentList(@RequestParam String name){

        StudentArrayList.get(0).setName(name);
        return "update Student Successfully"+name;

    }
    @RequestMapping("/delete_student/{index}")
    public String RemoveStudentList(@PathVariable int index){

        StudentArrayList.remove(0);
        return "Delete student data";
    }
}
