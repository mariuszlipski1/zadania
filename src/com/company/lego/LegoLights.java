package com.company.lego;

import com.company.base.LegoPart;

public class LegoLights implements LegoPart {

    @Override
    public String getName() {
        return LegoLights.class.getSimpleName() + " " + this;
    }
}
