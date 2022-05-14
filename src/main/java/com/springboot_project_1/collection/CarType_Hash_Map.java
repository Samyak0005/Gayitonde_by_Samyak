package com.springboot_project_1.collection;

import com.springboot_project_1.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class CarType_Hash_Map {
    @RequestMapping("/carlist")
    public ArrayList<Car> CreateCarList(){
        HashMap<Integer,ArrayList<Car>> carlist = new HashMap<>();
        ArrayList<Car> CARLIST = new ArrayList<>();
        Car car1 = new Car("MARUTI_DZIRE_SADAN",1000000.0,"XZ+ Topmodel","marutiservice");
        Car car2 = new Car("VW_POLO_HATHBACK",1000000.0,"GT Line Topmodel","performance oriented");
        Car car3 = new Car("TATA SAFARI SUV",2500000.0,"XZ+ Middle","ventilated seat");

        CARLIST.add(car1);
        CARLIST.add(car2);
        CARLIST.add(car3);

        carlist.put(1,CARLIST);

        return CARLIST;
    }
}
