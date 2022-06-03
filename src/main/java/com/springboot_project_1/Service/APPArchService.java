package com.springboot_project_1.Service;

import com.springboot_project_1.Repository.AppArrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APPArchService {
    @Autowired
    AppArrRepo obj;
    public String response(){
        return obj.response();
    }
}
