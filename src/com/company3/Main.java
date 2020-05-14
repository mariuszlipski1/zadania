package com.company3;


import com.company3.scrumbleeggs.Scrumbless;

import java.util.Scanner;

public class Main {
    private static int quantity;

    public static void main(String[] args) {
        System.out.println("Robienie jajecznicy");
        Scanner input = new Scanner(System.in);
        quantity = input.nextInt();
        System.out.println(quantity);




        Scrumbless moja = new Scrumbless();
        moja.setQuantity(2);

    }
}
