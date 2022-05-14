package com.springboot_project_1.model;

public class Mobile {
    String Brande_name;
    int Camera_Mgp;
    Double Display_Size;

    public Mobile(String brande_name, int camera_Mgp, Double display_Size) {
        Brande_name = brande_name;
        Camera_Mgp = camera_Mgp;
        Display_Size = display_Size;

    }

    public String getBrande_name() {
        return Brande_name;
    }

    public void setBrande_name(String brande_name) {
        Brande_name = brande_name;
    }

    public int getCamera_Mgp() {
        return Camera_Mgp;
    }

    public void setCamera_Mgp(int camera_Mgp) {
        Camera_Mgp = camera_Mgp;
    }

    public Double getDisplay_Size() {
        return Display_Size;
    }

    public void setDisplay_Size(Double display_Size) {
        Display_Size = display_Size;
    }
}
