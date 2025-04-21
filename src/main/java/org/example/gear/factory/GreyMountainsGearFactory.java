package org.example.gear.factory;

import org.example.gear.armor.Armor;
import org.example.gear.armor.ChainMail;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.ShortSword;
import org.example.gear.weapon.Weapon;

public class GreyMountainsGearFactory implements OrkGearFactory {
    @Override
    public Weapon createWeapon() {
        return new ShortSword("Короткий меч Мглистых Гор");
    }

    @Override
    public Armor createArmor() {
        return new ChainMail("Кольчужная броня");
    }

    @Override
    public Banner createBanner() {
        return new Banner("Знамя Серых Гор");
    }
}
