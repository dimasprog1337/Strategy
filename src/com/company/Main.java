package com.company;

public class Main {

    public static void main(String[] args) {

        UnitFactory archerFactory = new ArcherFactory();
        UnitFactory spearmanFactory = new SpearmanFactory();
        UnitFactory horsemanFactory = new HorsemanFactory();

        Archer archer = (Archer) archerFactory.createUnit();
        Spearman spearman = (Spearman) spearmanFactory.createUnit();
        Horseman horseman = (Horseman) horsemanFactory.createUnit();

        Squad squad = new Squad();

        squad.addArcher(archer);
        squad.addSpearman(spearman);
        squad.addHorseman(horseman);

        archer.attack(spearman);
        spearman.fortify();
        horseman.charge(archer);

        System.out.println("Здоровье лучника: " + archer.getHealth());
        System.out.println("Здоровье копейщика: " + spearman.getHealth());
        System.out.println("Здоровье всадника: " + horseman.getHealth());

        System.out.println("Общая сила отряда: " + squad.totalStrength());
    }
}