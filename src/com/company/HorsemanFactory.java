package com.company;

public class HorsemanFactory extends UnitFactory {

    @Override
    public Unit createUnit() {
        return new Horseman();
    }
}