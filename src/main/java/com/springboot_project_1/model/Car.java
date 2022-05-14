package com.springboot_project_1.model;

public class Car {
    String car_Type;
    Double car_price;
    String car_model;
    String car_SpecialFeature;

    public Car(String car_Type, Double car_price, String car_model, String car_SpecialFeature) {
        this.car_Type = car_Type;
        this.car_price = car_price;
        this.car_model = car_model;
        this.car_SpecialFeature = car_SpecialFeature;
    }

    public String getCar_Type() {
        return car_Type;
    }

    public void setCar_Type(String car_Type) {
        this.car_Type = car_Type;
    }

    public Double getCar_price() {
        return car_price;
    }

    public void setCar_price(Double car_price) {
        this.car_price = car_price;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getCar_SpecialFeature() {
        return car_SpecialFeature;
    }

    public void setCar_SpecialFeature(String car_SpecialFeature) {
        this.car_SpecialFeature = car_SpecialFeature;
    }
}
