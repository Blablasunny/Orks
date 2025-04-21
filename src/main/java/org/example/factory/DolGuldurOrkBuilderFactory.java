package org.example.factory;

import org.example.ork.builder.DolGuldurOrkBuilder;
import org.example.ork.builder.OrkBuilder;

public class DolGuldurOrkBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        return new DolGuldurOrkBuilder();
    }
}

