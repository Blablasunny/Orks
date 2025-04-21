package org.example.ork;

import java.util.Random;

public class OrkNameGenerator {
    private static final String[] PREFIXES = {
            "Гор", "Кор", "Тор", "Мор", "Дор", "Бор"
    };

    private static final String[] SUFFIXES = {
            "баг", "гаш", "хаг", "раг", "зог", "мог"
    };

    private static final Random random = new Random();

    public static String generateName() {
        String prefix = PREFIXES[random.nextInt(PREFIXES.length)];
        String suffix = SUFFIXES[random.nextInt(SUFFIXES.length)];
        return prefix + suffix;
    }
}
