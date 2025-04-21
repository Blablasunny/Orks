package org.example.ork.builder;

import org.example.gear.armor.SteelArmor;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.HeavySword;
import org.example.ork.Ork;
import org.example.ork.Tribe;

public class MordorOrkBuilder extends OrkBuilder {
    public MordorOrkBuilder() {
        super(Tribe.MORADOR);
    }

    @Override
    protected void initializeStats() {
        strength = 70;    // Высокая сила (+30%)
        agility = 35;     // Низкая ловкость
        intelligence = 25; // Базовый интеллект
        health = 125;     // Базовое здоровье
    }

    @Override
    public Ork build() {
        return new Ork(name, weapon != null ? weapon : new HeavySword("Тяжелый меч Мордора"),
                armor != null ? armor : new SteelArmor("Стальная броня"),
                banner != null ? banner : new Banner("Знамя Красного Глаза"),
                strength, agility, intelligence, health, tribe);
    }
}