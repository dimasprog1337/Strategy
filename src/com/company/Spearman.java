package com.company;

public class Spearman extends Unit {

    public Spearman() {
        super(14, 2, 2);
    }

    public void fortify() {
        setArmour(getArmour() + 2);
    }
}