package com.company;

public class SpearmanFactory extends UnitFactory {

    @Override
    public Unit createUnit() {
        return new Spearman();
    }
}