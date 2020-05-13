package com.company.sport;

import com.company.base.Car;

public class SportF1Car implements Car {

    private final String brand;

    public SportF1Car(String brand){
        this.brand = brand;
    }

    @Override
    public void drive() {
        System.out.println("Start driving electric car brand of " + brand);
    }
}
