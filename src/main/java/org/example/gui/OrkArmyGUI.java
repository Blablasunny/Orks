package org.example.gui;

import org.example.OrkController;
import org.example.ork.Ork;
import org.example.ork.Tribe;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class OrkArmyGUI extends JFrame {
    private JTree tree;
    private ArmyTreeModel model;
    private JPanel infoPanel;
    private JPanel controlPanel;
    private JComboBox<Tribe> tribeComboBox;
    private JComboBox<String> roleComboBox;
    private JButton createButton;
    private OrkController controller;

    public OrkArmyGUI() {
        setTitle("Армия Мордора");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createGUI();
    }

    private void createGUI() {
        model = new ArmyTreeModel();
        controller = new OrkController(model, this);

        tree = new JTree(model);
        tree.addTreeSelectionListener(e -> updateInfoPanel());

        controlPanel = new JPanel(new FlowLayout());

        tribeComboBox = new JComboBox<>(Tribe.values());
        controlPanel.add(new JLabel("Племя:"));
        controlPanel.add(tribeComboBox);

        String[] roles = {"Базовый", "Командир", "Разведчик"};
        roleComboBox = new JComboBox<>(roles);
        controlPanel.add(new JLabel("Роль:"));
        controlPanel.add(roleComboBox);


        createButton = new JButton("Создать орка");
        createButton.addActionListener(e -> controller.createOrk());
        controlPanel.add(createButton);

        infoPanel = new JPanel(new BorderLayout());
        infoPanel.setBorder(BorderFactory.createTitledBorder("Информация об орке"));

        add(new JScrollPane(tree), BorderLayout.CENTER);
        add(controlPanel, BorderLayout.NORTH);
        add(infoPanel, BorderLayout.EAST);

        setSize(800, 600);
    }

    public void updateInfoPanel() {
        DefaultMutableTreeNode selectedNode =
                (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

        if (selectedNode != null && selectedNode.getUserObject() instanceof Ork) {
            Ork орк = (Ork) selectedNode.getUserObject();
            infoPanel.removeAll();

            JPanel statsPanel = new JPanel(new GridLayout(0, 2));
            statsPanel.add(new JLabel("Имя: " + орк.getName()));
            statsPanel.add(new JLabel("Племя: " + орк.getTribe()));

            JProgressBar strengthBar = new JProgressBar(0, 100);
            strengthBar.setValue(орк.getStrength());
            statsPanel.add(new JLabel("Сила:"));
            statsPanel.add(strengthBar);

            JProgressBar agilityBar = new JProgressBar(0, 100);
            agilityBar.setValue(орк.getAgility());
            statsPanel.add(new JLabel("Ловкость:"));
            statsPanel.add(agilityBar);

            JProgressBar intelligenceBar = new JProgressBar(0, 50);
            intelligenceBar.setValue(орк.getIntelligence());
            statsPanel.add(new JLabel("Интеллект:"));
            statsPanel.add(intelligenceBar);

            JProgressBar healthBar = new JProgressBar(50, 200);
            healthBar.setValue(орк.getHealth());
            statsPanel.add(new JLabel("Здоровье:"));
            statsPanel.add(healthBar);

            JPanel gearPanel = new JPanel(new GridLayout(0, 2));
            gearPanel.add(new JLabel("Оружие: " + орк.getWeapon().getName()));
            gearPanel.add(new JLabel("Броня: " + орк.getArmor().getName()));
            gearPanel.add(new JLabel("Знамя: " + орк.getBanner().getName()));

            infoPanel.add(statsPanel, BorderLayout.NORTH);
            infoPanel.add(gearPanel, BorderLayout.CENTER);

            infoPanel.revalidate();
            infoPanel.repaint();
        }
    }

    public ArmyTreeModel getModel() {
        return model;
    }

    public JComboBox<Tribe> getTribeComboBox() {
        return tribeComboBox;
    }

    public JComboBox<String> getRoleComboBox() {
        return roleComboBox;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            OrkArmyGUI gui = new OrkArmyGUI();
            gui.setVisible(true);
        });
    }
}