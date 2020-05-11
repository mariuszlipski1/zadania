package com.company.lego;

import com.company.base.LegoPart;

public class LegoWheels implements LegoPart{

    @Override
    public String getName() {
        return LegoWheels.class.getSimpleName() + " " + this;
    }
}
