package com.company;

public class Main {

    public static void main(String[] args) {
	// Dostęp do metod z pomocą Interfejsów
        Car car = new CombustionCar("Skoda");
        car.drive();
        Car electricCar = new ElectricCar("Tesla");
        electricCar.drive();

        //car.someMethod();
    }
}
