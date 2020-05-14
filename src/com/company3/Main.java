package com.company3;

import com.company3.scrumbleeggs.Egg;

public class Main {


    public static void main(String[] args) {
        System.out.println("static i obiekt metody");
        Egg first = new Egg();
        first.setQuantity(5);
        Egg.avalibleQuantity(first.getQuantity());

    }
}
