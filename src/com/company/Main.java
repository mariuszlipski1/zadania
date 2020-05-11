package com.company;

import com.company.base.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Dostęp do metod z pomocą Interfejsów
        Car car = new CombustionCar("Skoda");
        Car electricCar = new ElectricCar("Tesla");

        List<Car> list = new ArrayList<Car>();
        list.add(car);
        list.add(electricCar);

        for (Car i: list) {
            i.drive();
        }

        //car.someMethod();
    }
}
