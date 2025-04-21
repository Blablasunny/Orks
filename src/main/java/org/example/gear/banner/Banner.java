package org.example.gear.banner;

public class Banner {
    private String name;
    private boolean isCommanderBanner;

    public Banner(String name) {
        this.name = name;
        this.isCommanderBanner = false;
    }

    public Banner(String name, boolean isCommanderBanner) {
        this.name = name;
        this.isCommanderBanner = isCommanderBanner;
    }

    public String getName() {
        return name;
    }

    public boolean isCommanderBanner() {
        return isCommanderBanner;
    }
}
