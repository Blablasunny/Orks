package org.example.ork.builder;

import org.example.gear.armor.ChainMail;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.Spear;
import org.example.ork.Ork;
import org.example.ork.Tribe;

public class DolGuldurOrkBuilder extends OrkBuilder {
    public DolGuldurOrkBuilder() {
        super(Tribe.DOL_GULDUR);
    }

    @Override
    protected void initializeStats() {
        strength = 50;    // Сбалансированная сила
        agility = 50;     // Сбалансированная ловкость
        intelligence = 25; // Базовый интеллект
        health = 125;     // Базовое здоровье
    }

    @Override
    public Ork build() {
        return new Ork(name, weapon != null ? weapon : new Spear("Копье Дол Гулдура"),
                armor != null ? armor : new ChainMail("Кольчужная броня"),
                banner != null ? banner : new Banner("Знамя с пауком"),
                strength, agility, intelligence, health, tribe);
    }
}