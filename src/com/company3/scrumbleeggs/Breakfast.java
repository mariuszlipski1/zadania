package com.company3.scrumbleeggs;

import java.util.List;

public class Breakfast {
    Scrumbless scrumbless;
    Coffee coffee;

    public Breakfast(int Eggs, int Ham, int coffee1){
        Scrumbless scrumbless = new Scrumbless(Eggs,Ham);
        System.out.println(scrumbless);
        Coffee coffee = new Coffee(coffee1);
        System.out.println(coffee);
    }

    @Override
    public String toString() {
        return "Breakfast"+hashCode()+"{" +
                "scrumbless=" + scrumbless +
                '}';
    }
}
