package com.company;

public class CombustionCar implements Car{

    private final String brand;

    public CombustionCar(String brand){
        this.brand = brand;
    }

    @Override
    public void drive() {
      System.out.println("Start driving combustion car brand of " + brand);
    }

    public void someMethod(){
    }
}
