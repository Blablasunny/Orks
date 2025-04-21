package org.example.factory;

import org.example.ork.Tribe;
import org.example.ork.builder.MistyMountainsOrkBuilder;
import org.example.ork.builder.OrkBuilder;

public class MistyMountainsOrkBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        return new MistyMountainsOrkBuilder();
    }
}
