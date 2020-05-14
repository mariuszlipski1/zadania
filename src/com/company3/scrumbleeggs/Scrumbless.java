package com.company3.scrumbleeggs;

import java.util.ArrayList;
import java.util.List;

public class Scrumbless {
    public List<Egg> listEggs = new ArrayList<>();
    public List<Ham> listHam = new ArrayList<>();

    public Scrumbless(){}
    public Scrumbless(int EggsQuantity, int HamQuantity){
        this();
        avalibleQuantity(EggsQuantity);
        makeEggs(EggsQuantity);
        avalibleQuantity(HamQuantity);
        makeHam(HamQuantity);
    }

    public static void avalibleQuantity(int i){
        if(i > 0){
            System.out.println("ilość poprawna a dokładnie");
        }
    }

    public List<Egg> makeEggs(int i){

        for(int a = 0; a < i; a++){
            listEggs.add(new Egg());
        }
        return listEggs;
    }
    public List<Ham> makeHam(int i){

        for(int a = 0; a < i; a++){
            listHam.add(new Ham());
        }
        return listHam;
    }

    @Override
    public String toString() {
        return "Scrumbless"+hashCode()+"{" +
                "listEggs=" + listEggs +
                ", listHam=" + listHam +
                '}';
    }
}
