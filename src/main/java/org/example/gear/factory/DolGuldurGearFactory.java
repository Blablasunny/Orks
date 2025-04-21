package org.example.gear.factory;

import org.example.gear.armor.Armor;
import org.example.gear.armor.ChainMail;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.Spear;
import org.example.gear.weapon.Weapon;

// Фабрика снаряжения для Дол Гулдура
public class DolGuldurGearFactory implements OrkGearFactory {
    @Override
    public Weapon createWeapon() {
        return new Spear("Копье Дол Гулдура");
    }

    @Override
    public Armor createArmor() {
        return new ChainMail("Кольчужная броня");
    }

    @Override
    public Banner createBanner() {
        return new Banner("Знамя с пауком");
    }
}
