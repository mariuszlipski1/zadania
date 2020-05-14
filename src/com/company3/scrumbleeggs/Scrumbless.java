package com.company3.scrumbleeggs;

public class Scrumbless {

    private int quantity;
    Egg eggs;
    Ham ham;

    public Scrumbless(){

    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public static void avalibleQuantity(int i){
        if(i > 0){
            System.out.println("ilość poprawna a dokładnie");
        }
    }

    public void setEggs(Egg eggs) {
        this.eggs = eggs;
    }

    public void setHam(Ham ham) {
        this.ham = ham;
    }
}
