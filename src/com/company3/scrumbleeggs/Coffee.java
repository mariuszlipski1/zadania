package com.company3.scrumbleeggs;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    public List<Coffee> listCoffee = new ArrayList<>();

    public Coffee(){};
    public Coffee(int coffeeQuantity){
        this();
        Scrumbless.avalibleQuantity(coffeeQuantity);
        makeCoffee(coffeeQuantity);
    }

    public List<Coffee> makeCoffee(int i){
        for(int a = 0; a < i; a++){
            listCoffee.add(new Coffee());
        }
        return listCoffee;
    }

    @Override
    public String toString() {
        return "Coffee"+hashCode()+"{" +
                "listCoffee=" + listCoffee +
                '}';
    }
}
