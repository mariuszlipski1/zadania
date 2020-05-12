package com.company.lego;

import com.company.base.Builder;
import com.company.base.Car;
import com.company.base.LegoPart;

import java.util.ArrayList;
import java.util.List;

public class LegoCar implements Car {

    private final List<LegoPart> parts;

    private LegoCar(List<LegoPart> list){
        this.parts = list;
    }

    @Override
    public void drive() {
        System.out.println("Start driving Lego car " + this.toString());
    }

    @Override
    public String toString() {
        String text ="";

        for(LegoPart i : parts) {
            String name = i.getName();
            text = text + name + " ";
        }

        return text;
    }

    public static class Builder implements com.company.base.Builder<LegoCar>{

        private final List<LegoPart> parts = new ArrayList<>();

        public Builder addPart(LegoPart part){
            parts.add(part);
            return  this;
        }

        @Override
        public LegoCar build() {
            return new LegoCar(parts);
        }
    }
}
