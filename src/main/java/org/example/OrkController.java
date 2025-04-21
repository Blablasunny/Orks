package org.example;

import org.example.gui.ArmyTreeModel;
import org.example.gui.OrkArmyGUI;
import org.example.ork.Ork;
import org.example.ork.Tribe;
import org.example.ork.builder.*;

import java.util.HashMap;
import java.util.Map;

public class OrkController {
    private ArmyTreeModel model;
    private OrkArmyGUI view;
    private Map<Tribe, OrkBuilder> builders;

    public OrkController(ArmyTreeModel model, OrkArmyGUI view) {
        this.model = model;
        this.view = view;
        initializeBuilders();
    }

    private void initializeBuilders() {
        builders = new HashMap<>();
        builders.put(Tribe.MISTY_MOUNTAINS, new MistyMountainsOrkBuilder());
        builders.put(Tribe.MORADOR, new MordorOrkBuilder());
        builders.put(Tribe.GREY_MOUNTAINS, new GreyMountainsOrkBuilder());
        builders.put(Tribe.DOL_GULDUR, new DolGuldurOrkBuilder());
    }

    public void setModel(ArmyTreeModel model) {
        this.model = model;
    }

    public void setView(OrkArmyGUI view) {
        this.view = view;
    }

    public void createOrk() {
        Tribe tribe = (Tribe) view.getTribeComboBox().getSelectedItem();
        String role = (String) view.getRoleComboBox().getSelectedItem();

        OrkBuilder builder = builders.get(tribe);

        builder.withRole(role);

        if (builder.getName() == null) {
            builder.withRandomName();
        }

        Ork орк = builder.build();

        model.addOrk(орк);

        updateView();
    }

    public void updateView() {
        view.updateInfoPanel();
    }
}