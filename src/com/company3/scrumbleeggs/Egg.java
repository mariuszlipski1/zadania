package com.company3.scrumbleeggs;

public class Egg {

    private int quantity;
    private static int eggs;

    public Egg(){ };
    public Egg(int quantity){
        this();
        eggs = quantity;
    }

    public static void avalibleQuantity(int i){
        if(i > 0){
            System.out.println("ilość poprawna");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
