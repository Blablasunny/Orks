package org.example;

import org.example.gui.OrkArmyGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            OrkArmyGUI gui = new OrkArmyGUI();
            gui.setVisible(true);
        });
    }
}