package com.springboot_project_1.collection;

import com.springboot_project_1.model.Mobile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Mobile_Array_List {
    @RequestMapping("/Mobilelist1")
    public ArrayList<Mobile> CreateMobileList(){

        ArrayList<Mobile> mobilelist = new ArrayList<>();
        Mobile mobile1 = new Mobile("ONEPLUS", 50,67.7);
        Mobile mobile2 = new Mobile("SAMSUNG",64,65.5);
        Mobile mobile3 = new Mobile("IPHONE", 13,55.0);

        mobilelist.add(mobile1);
        mobilelist.add(mobile2);
        mobilelist.add(mobile3);

        return mobilelist;


    }
}
