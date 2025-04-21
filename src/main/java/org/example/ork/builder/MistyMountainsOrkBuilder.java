package org.example.ork.builder;

import org.example.gear.armor.LeatherArmor;
import org.example.gear.banner.Banner;
import org.example.gear.weapon.Bow;
import org.example.ork.Ork;
import org.example.ork.Tribe;

public class MistyMountainsOrkBuilder extends OrkBuilder {
    public MistyMountainsOrkBuilder() {
        super(Tribe.MISTY_MOUNTAINS);
    }

    @Override
    protected void initializeStats() {
        strength = 40;    // Низкая сила
        agility = 70;     // Высокая ловкость (+30%)
        intelligence = 25; // Базовый интеллект
        health = 125;     // Базовое здоровье
    }

    @Override
    public Ork build() {
        return new Ork(name, weapon != null ? weapon : new Bow("Охотничий лук Мглистых Гор"),
                armor != null ? armor : new LeatherArmor("Кожаная броня"),
                banner != null ? banner : new Banner("Знамя с изображением Луны"),
                strength, agility, intelligence, health, tribe);
    }
}
