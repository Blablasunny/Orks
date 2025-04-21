package org.example.factory;

import org.example.ork.Tribe;
import org.example.ork.builder.MordorOrkBuilder;
import org.example.ork.builder.OrkBuilder;

public class MordorOrkBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        return new MordorOrkBuilder();
    }
}
