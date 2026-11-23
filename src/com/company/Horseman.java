package com.company;

public class Horseman extends Unit {

    public Horseman() {
        super(20, 5, 1);
    }

    public void charge(Unit enemy) {
        enemy.setHealth(enemy.getHealth() - getAttack() * 2);
    }
}