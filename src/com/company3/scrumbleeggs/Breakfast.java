package com.company3.scrumbleeggs;

public class Breakfast {
    Scrumbless scrumbless;

    public Breakfast(int Eggs, int Ham, int coffee){
        Scrumbless scrumbless = new Scrumbless(Eggs,Ham);
        System.out.println(scrumbless);
        Coffee coffee1 = new Coffee(coffee);
    }

    @Override
    public String toString() {
        return "Breakfast"+hashCode()+"{" +
                "scrumbless=" + scrumbless +
                '}';
    }
}
