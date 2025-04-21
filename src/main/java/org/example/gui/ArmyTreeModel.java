package org.example.gui;

import org.example.ork.Ork;
import org.example.ork.Tribe;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class ArmyTreeModel extends DefaultTreeModel {
    public ArmyTreeModel() {
        super(new DefaultMutableTreeNode("Армия Мордора"));
    }

    public void addOrk(Ork орк) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) getRoot();
        DefaultMutableTreeNode tribeNode = null;

        for (int i = 0; i < root.getChildCount(); i++) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) root.getChildAt(i);
            if (((Tribe) node.getUserObject()).equals(орк.getTribe())) {
                tribeNode = node;
                break;
            }
        }

        if (tribeNode == null) {
            tribeNode = new DefaultMutableTreeNode(орк.getTribe());
            root.add(tribeNode);
        }

        DefaultMutableTreeNode orkNode = new DefaultMutableTreeNode(орк);
        tribeNode.add(orkNode);
        reload();
    }
}