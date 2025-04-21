package org.example.ork.builder;

import org.example.gear.armor.Armor;
import org.example.gear.banner.Banner;
import org.example.gear.factory.*;
import org.example.gear.weapon.Bow;
import org.example.gear.weapon.Horn;
import org.example.gear.weapon.Weapon;
import org.example.ork.Ork;
import org.example.ork.OrkNameGenerator;
import org.example.ork.Tribe;

public abstract class OrkBuilder {
    protected String name;
    protected Weapon weapon;
    protected Armor armor;
    protected Banner banner;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int health;
    protected Tribe tribe;

    public OrkBuilder(Tribe tribe) {
        this.tribe = tribe;
        initializeStats();
    }

    protected abstract void initializeStats();

    public String getName() {
        return name;
    }

    public OrkBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public OrkBuilder withRandomName() {
        this.name = OrkNameGenerator.generateName();
        return this;
    }

    public OrkBuilder withWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public OrkBuilder withArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public OrkBuilder withBanner(Banner banner) {
        this.banner = banner;
        return this;
    }

    public OrkBuilder withRole(String role) {
        if ("Командир".equals(role)) {
            this.banner = new Banner("Командирское знамя", true);
            this.weapon = new Horn("Горн");
        } else if ("Разведчик".equals(role)) {
            this.weapon = new Bow("Оркский лук");
        }
        return this;
    }

    public OrkBuilder withDefaultGear() {
        OrkGearFactory gearFactory = getGearFactoryForTribe();
        this.weapon = gearFactory.createWeapon();
        this.armor = gearFactory.createArmor();
        this.banner = gearFactory.createBanner();
        return this;
    }

    private OrkGearFactory getGearFactoryForTribe() {
        return switch (tribe) {
            case MORADOR -> new MordorGearFactory();
            case DOL_GULDUR -> new DolGuldurGearFactory();
            case MISTY_MOUNTAINS -> new MistyMountainsGearFactory();
            case GREY_MOUNTAINS -> new GreyMountainsGearFactory();
        };
    }

    public abstract Ork build();
}