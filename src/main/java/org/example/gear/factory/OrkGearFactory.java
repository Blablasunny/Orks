package org.example.gear.factory;

import org.example.gear.armor.Armor;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.Weapon;

public interface OrkGearFactory {
    Weapon createWeapon();
    Armor createArmor();
    Banner createBanner();
}
