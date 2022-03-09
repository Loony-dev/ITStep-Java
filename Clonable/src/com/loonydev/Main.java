package com.loonydev;

public class Main {

    public static void main(String[] args) {
        Sword sword = new Sword(1000, 100);
        Armor armor = new Armor("Helmet", 10, 1000);

        Warrior warrior = new Warrior("Tom", 100, 100, armor, sword);
        Warrior copyWarrior = warrior.clone();

        System.out.println(warrior.getClass().equals(copyWarrior.getClass()));
        System.out.println(warrior.equals(copyWarrior));
    }
}
