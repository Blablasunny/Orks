package org.example.ork.builder;

import org.example.gear.armor.ChainMail;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.BattleAxe;
import org.example.ork.Ork;
import org.example.ork.Tribe;

public class GreyMountainsOrkBuilder extends OrkBuilder {
    public GreyMountainsOrkBuilder() {
        super(Tribe.GREY_MOUNTAINS);
    }

    @Override
    protected void initializeStats() {
        strength = 60;    // Умеренная сила
        agility = 45;     // Умеренная ловкость
        intelligence = 25; // Базовый интеллект
        health = 125;     // Базовое здоровье
    }

    @Override
    public Ork build() {
        return new Ork(name, weapon != null ? weapon : new BattleAxe("Боевой топор Серых Гор"),
                armor != null ? armor : new ChainMail("Кольчужная броня"),
                banner != null ? banner : new Banner("Знамя Серых Гор"),
                strength, agility, intelligence, health, tribe);
    }
}