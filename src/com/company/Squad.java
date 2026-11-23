package com.company;

import java.util.ArrayList;

public class Squad {

    private ArrayList<Unit> units = new ArrayList<>();

    public void addArcher(Archer archer) {
        units.add(archer);
    }

    public void addSpearman(Spearman spearman) {
        units.add(spearman);
    }

    public void addHorseman(Horseman horseman) {
        units.add(horseman);
    }

    public int totalStrength() {
        int total = 0;

        for (Unit unit : units) {
            total += unit.getAttack();
        }

        return total;
    }
}