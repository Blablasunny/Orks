package org.example.gear.factory;

import org.example.gear.armor.Armor;
import org.example.gear.armor.SteelArmor;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.HeavySword;
import org.example.gear.weapon.Weapon;

public class MordorGearFactory implements OrkGearFactory {
    @Override
    public Weapon createWeapon() {
        return new HeavySword("Тяжелый меч Мордора");
    }

    @Override
    public Armor createArmor() {
        return new SteelArmor("Стальная броня");
    }

    @Override
    public Banner createBanner() {
        return new Banner("Знамя с Красным Оком");
    }
}
