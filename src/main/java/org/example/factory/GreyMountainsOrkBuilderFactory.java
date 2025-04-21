package org.example.factory;

import org.example.ork.Tribe;
import org.example.ork.builder.GreyMountainsOrkBuilder;
import org.example.ork.builder.OrkBuilder;

public class GreyMountainsOrkBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        return new GreyMountainsOrkBuilder();
    }
}
