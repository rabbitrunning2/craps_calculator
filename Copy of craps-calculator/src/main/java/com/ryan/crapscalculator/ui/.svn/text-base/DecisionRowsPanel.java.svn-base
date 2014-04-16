package com.ryan.crapscalculator.ui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DecisionRowsPanel extends JPanel {

    private JPanel mainPanel;
    private GridLayout gridLayout;
    private final List<DecisionRow> rowList;

    public DecisionRowsPanel() {
        rowList = new ArrayList<DecisionRow>();

        JPanel leftDecisionRowPanel = createleftDecisionRowPanel();
        JPanel rightDecisionRowPanel = createRightDecisionRowPanel();

        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 1));
        mainPanel.add(leftDecisionRowPanel);
        mainPanel.add(rightDecisionRowPanel);

        add(mainPanel);
    }

    private JPanel createleftDecisionRowPanel() {
        JPanel leftDecisionRowPanel = new JPanel();
        gridLayout = new GridLayout(26, 0);
        leftDecisionRowPanel.setLayout(gridLayout);
        leftDecisionRowPanel.add(createHeaderPanel());
        for (int i = 0; i < 25; i++) {
            DecisionRow row = new DecisionRow();
            rowList.add(i, row);
            leftDecisionRowPanel.add(row);
        }
        return leftDecisionRowPanel;
    }

    private JPanel createRightDecisionRowPanel() {
        JPanel rightDecisionRowPanel = new JPanel();
        rightDecisionRowPanel.setLayout(gridLayout);
        rightDecisionRowPanel.add(createHeaderPanel());
        for (int i = 25; i < 50; i++) {
            DecisionRow row = new DecisionRow();
            rowList.add(i, row);
            rightDecisionRowPanel.add(row);
        }
        return rightDecisionRowPanel;
    }

    private JPanel createHeaderPanel() {
        JLabel doLabel = new JLabel("Do");
        JLabel dontLabel = new JLabel("Don't");
        JLabel decisionLabel = new JLabel("Dec");

        JPanel headerPanel = new JPanel();
        headerPanel.add(doLabel);
        headerPanel.add(Box.createVerticalStrut(2));
        headerPanel.add(decisionLabel);
        headerPanel.add(Box.createVerticalStrut(2));
        headerPanel.add(dontLabel);

        return headerPanel;
    }

    public void clear() {
        for (DecisionRow row : rowList) {
            row.clear();
        }
    }

    public List<DecisionRow> getDecisionRowList() {
        return rowList;
    }

    public void resetRowColors() {
        for (DecisionRow row : rowList) {
            row.resetColor();
        }
    }

}
