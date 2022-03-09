package com.loonydev;

public class Sword implements Cloneable {

    private int durability;
    private int defense;

    // -- Constructors
    public Sword() {
        this.durability = 0;
        this.defense = 0;
    }

    // -- Methods


    public Sword(int durability, int defense) {
        this.durability = durability;
        this.defense = defense;
    }

    // -- Setters
    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // -- Getters
    public int getDurability() {
        return durability;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public Sword clone() {
        try {
            return (Sword) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
