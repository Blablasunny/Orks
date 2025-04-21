package org.example.ork;

import org.example.gear.banner.Banner;
import org.example.gear.weapon.Bow;
import org.example.ork.builder.OrkBuilder;

public class OrkDirector {
    private OrkBuilder builder;

    public void setBuilder(OrkBuilder builder) {
        this.builder = builder;
    }

    public Ork createBasicOrk() {
        return builder.build();
    }

    public Ork createLeaderOrk() {
        return builder.withBanner(new Banner("Командирское знамя", true))
                .build();
    }

    public Ork createScoutOrk() {
        return builder.withWeapon(new Bow("Оркский лук"))
                .build();
    }
}
