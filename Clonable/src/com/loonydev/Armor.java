package com.loonydev;

public class Armor implements Cloneable {

    private String name;

    private int attack;
    private int durability;

    // -- Constructors
    public Armor() {
        this.name = "";

        this.attack = 0;
        this.durability = 0;
    }

    public Armor(String name, int attack, int durability) {
        this.name = name;

        this.attack = attack;
        this.durability = durability;
    }

    // -- Methods
    @Override
    public Armor clone() {
        try {
            return (Armor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // -- Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    // -- Getters
    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDurability() {
        return durability;
    }
}
