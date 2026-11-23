package com.company;

public abstract class Unit {
    private int Health;
    private int Attack;
    private int Armour;

    public Unit(int health, int attack, int armour) {
        this.Health = health;
        this.Attack = attack;
        this.Armour = armour;
    }

    public void setHealth(int health) {
        this.Health = Math.max(0, health);
    }

    public void setArmour(int armour) {
        this.Armour = Math.max(0, armour);
    }

    public void setAttack(int attack) {
        this.Attack = Math.max(0, attack);
    }

    public int getHealth() {
        return Health;
    }

    public int getArmour() {
        return Armour;
    }

    public int getAttack() {
        return Attack;
    }

    public void attack(Unit enemy) {
        int damage = Math.max(0, Attack - enemy.getArmour());
        enemy.setHealth(enemy.getHealth() - damage);
    }
}
