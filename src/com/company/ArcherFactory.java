package com.company;

public class ArcherFactory extends UnitFactory {

    @Override
    public Unit createUnit() {
        return new Archer();
    }
}