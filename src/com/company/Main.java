package com.company;

import com.company.base.Builder;
import com.company.base.Car;
import com.company.base.LegoPart;
import com.company.lego.LegoCar;
import com.company.lego.LegoLights;
import com.company.lego.LegoTires;
import com.company.lego.LegoWheels;

import com.company.sport.SportNitro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Dostęp do metod z pomocą Interfejsów
        Car car = new CombustionCar("Skoda");
        Car electricCar = new ElectricCar("Tesla");

        Car legoCar = new LegoCar.Builder()
                .addPart(new LegoLights())
                .addPart(new LegoWheels())
                .addPart(new LegoTires())
                .build();


        List<Car> list = new ArrayList<Car>();
        list.add(car);
        list.add(electricCar);
        list.add(legoCar);

        for (Car i: list) {
            i.drive();
        }

        SportNitro nitro = new SportNitro();
        System.out.println(nitro.indexNitro);
        nitro.nitroDisplay();



    }
}
