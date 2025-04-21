package org.example.gear.armor;

public abstract class Armor {
    private String name;
    private int protection;

    public Armor(String name, int protection) {
        this.name = name;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public int getProtection() {
        return protection;
    }
}
