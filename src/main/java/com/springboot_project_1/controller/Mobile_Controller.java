package com.springboot_project_1.controller;
//CRUD
import com.springboot_project_1.model.Mobile;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
//add
@RestController
public class Mobile_Controller {
    ArrayList<Mobile> mobileArrayList = new ArrayList<>();
    @RequestMapping("/add_Mobile")
    public String addMobile(@RequestBody Mobile mobile1 ){
       // ArrayList<Mobile> mobileArrayList = new ArrayList<>();

        mobileArrayList.add(mobile1);

        return "Mobile Data Successfully Update";
    }
    //get
    @RequestMapping("/get_Mobile")
    public  ArrayList<Mobile> getMobileArrayList(){

        return mobileArrayList;

    }
    //update
    @RequestMapping("/update_Mobile")
    public String updateMobile(@RequestParam String name){
        mobileArrayList.get(1).setBrande_name(name);

        return "Name Update Successfully"+name;
    }
    //public String remove()

}
