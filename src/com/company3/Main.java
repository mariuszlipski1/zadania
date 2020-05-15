package com.company3;


import com.company3.scrumbleeggs.Breakfast;
import com.company3.scrumbleeggs.Coffee;
import com.company3.scrumbleeggs.Scrumbless;

import java.util.Scanner;

public class Main {
    public static int hamQuantity;
    public static int eggsQuantity;
    public static int coffeeQuantity;

    public static void main(String[] args) {
        System.out.println("Robienie jajecznicy");
        Scanner input = new Scanner(System.in);
        System.out.println("ilość jajek");
        eggsQuantity = input.nextInt();
        System.out.println("ilość szynki");
        hamQuantity = input.nextInt();
        System.out.println("ilość kawy");
        coffeeQuantity = input.nextInt();

        Breakfast breakfast = new Breakfast(eggsQuantity,hamQuantity,coffeeQuantity);
        System.out.println(breakfast);

    }
}
