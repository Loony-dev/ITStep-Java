package com.loonydev;

public class Warrior implements Cloneable {

    private String name;

    private int health;
    private int attack;

    private Armor armor;
    private Sword sword;

    // -- Constructors
    public Warrior() {
        this.name = "";

        this.health = 0;
        this.attack = 0;

        this.armor = new Armor();
        this.sword = new Sword();
    }

    public Warrior(String name, int health, int attack, Armor armor, Sword sword) {
        this.name = name;

        this.health = health;
        this.attack = attack;

        this.armor = armor;
        this.sword = sword;
    }

    // -- Methods
    @Override
    public Warrior clone() {
        try {
            Warrior clone = (Warrior) super.clone();

            clone.setArmor(this.getArmor().clone());
            clone.setSword(this.getSword().clone());

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // -- Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    // -- Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public Armor getArmor() {
        return armor;
    }

    public Sword getSword() {
        return sword;
    }
}
