package org.example.ork;

import org.example.gear.armor.Armor;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.Weapon;

public class Ork {
    private String name;
    private Weapon weapon;
    private Armor armor;
    private Banner banner;
    private int strength;
    private int agility;
    private int intelligence;
    private int health;
    private Tribe tribe;

    public Ork(String name, Weapon weapon, Armor armor, Banner banner,
               int strength, int agility, int intelligence, int health, Tribe tribe) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.banner = banner;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.health = health;
        this.tribe = tribe;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Banner getBanner() {
        return banner;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getHealth() {
        return health;
    }

    public Tribe getTribe() {
        return tribe;
    }
}
