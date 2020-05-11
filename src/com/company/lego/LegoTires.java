package com.company.lego;

import com.company.base.LegoPart;

public class LegoTires implements LegoPart {

    @Override
    public String getName() {
        return LegoTires.class.getSimpleName() + " " + this;
    }
}
