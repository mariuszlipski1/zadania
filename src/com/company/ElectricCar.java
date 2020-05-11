package com.company;

import com.company.base.Car;

public class ElectricCar implements Car {

    private final String brand;

    public ElectricCar(String brand){
        this.brand = brand;
    }
    @Override
    public void drive() {
        System.out.println("Start driving electric car brand of " + brand);
    }
}
