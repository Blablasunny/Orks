package org.example.gear.factory;

import org.example.gear.armor.Armor;
import org.example.gear.armor.LeatherArmor;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.BattleAxe;
import org.example.gear.weapon.Weapon;

public class MistyMountainsGearFactory implements OrkGearFactory {
    @Override
    public Weapon createWeapon() {
        return new BattleAxe("Боевой топор Серых Гор");
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor("Кожаная броня");
    }

    @Override
    public Banner createBanner() {
        return new Banner("Знамя с Луной");
    }
}