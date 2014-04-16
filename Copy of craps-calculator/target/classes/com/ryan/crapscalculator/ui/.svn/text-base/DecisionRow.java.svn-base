package com.ryan.crapscalculator.ui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JPanel;

import com.ryan.crapscalculator.rolls.DoCrapsRoll;
import com.ryan.crapscalculator.rolls.DoPassRoll;
import com.ryan.crapscalculator.rolls.DontCrapsRoll;
import com.ryan.crapscalculator.rolls.DontPassRoll;
import com.ryan.crapscalculator.rolls.NullRoll;
import com.ryan.crapscalculator.rolls.Roll;

@SuppressWarnings("serial")
public class DecisionRow extends JPanel {
    private DigitTextField doField;
    private DecisionTextField decisionField;
    private DigitTextField dontField;
    private JPanel mainPanel;

    public DecisionRow() {
        super();
        buildPanel();
    }

    private void buildPanel() {
        doField = new DigitTextField(2);
        decisionField = new DecisionTextField(1);
        dontField = new DigitTextField(2);

        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 1, 0));
        mainPanel.add(doField);
        mainPanel.add(Box.createHorizontalStrut(5));
        mainPanel.add(decisionField);
        mainPanel.add(Box.createHorizontalStrut(5));
        mainPanel.add(dontField);

        setLayout(new FlowLayout(FlowLayout.CENTER, 1, 0));
        add(mainPanel);
    }

    public void clear() {
        resetColor();
        doField.setText("");
        decisionField.setText("");
        dontField.setText("");
    }

    public void showError() {
        doField.setBackground(Color.red);
        dontField.setBackground(Color.red);
        decisionField.setBackground(Color.red);
    }

    public void resetColor() {
        doField.setBackground(Color.white);
        dontField.setBackground(Color.white);
        decisionField.setBackground(Color.white);
    }

    private boolean allFieldsBlank() {
        return ("".equals(decisionField.getText()) && "".equals(doField.getText()) && "".equals(dontField.getText()));
    }

    public Roll getAsRoll() {
        if (allFieldsBlank()) {
            return new NullRoll();
        }
        if ("P".equals(decisionField.getText())) {
            return createPassRoll();
        } else if ("C".equals(decisionField.getText())) {
            return createCrapsRoll();
        } else {
            throw new IllegalStateException("Decision Field must be either P or C");
        }
    }

    private Roll createPassRoll() {
        if ("".equals(dontField.getText()) && !"".equals(doField.getText())) {
            return createDoPassRoll();
        } else if ("".equals(doField.getText()) && !"".equals(dontField.getText())) {
            return createDontPassRoll();
        } else if ("".equals(dontField.getText()) && "".equals(doField.getText())) {
            throw new IllegalStateException("Either DO or DON'T value must be filled in");
        } else {
            throw new IllegalStateException("Both DO and DON't must not be filled in at the same time");
        }
    }

    private Roll createCrapsRoll() {
        if ("".equals(dontField.getText()) && !"".equals(doField.getText())) {
            return createDoCrapsRoll();
        } else if ("".equals(doField.getText()) && !"".equals(dontField.getText())) {
            return createDontCrapsRoll();
        } else if ("".equals(dontField.getText()) && "".equals(doField.getText())) {
            throw new IllegalStateException("Either DO or DON'T value must be filled in");
        } else {
            throw new IllegalStateException("Both DO and DON't must not be filled in at the same time");
        }
    }

    private Roll createDontPassRoll() {
        String dontValueText = dontField.getText();
        try {
            int dontValue = Integer.parseInt(dontValueText);
            if (dontValue < 4 || dontValue > 11) {
                throw new IllegalStateException("Invalid DON'T value");
            }
            return new DontPassRoll(dontValue);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Invalid DON'T value");
        }
    }

    private Roll createDoPassRoll() {
        String doValueText = doField.getText();
        try {
            int doValue = Integer.parseInt(doValueText);
            if (doValue < 4 || doValue > 11) {
                throw new IllegalStateException("Invalid DO value");
            }
            return new DoPassRoll(doValue);
        } catch (NumberFormatException nfe) {
            throw new IllegalStateException("Invalid DO value");
        }
    }

    private Roll createDontCrapsRoll() {
        String dontValueText = dontField.getText();
        try {
            int dontValue = Integer.parseInt(dontValueText);
            if (dontValue < 2 || dontValue == 7 || dontValue > 10) {
                throw new IllegalStateException("Invalid DON'T value");
            }
            return new DontCrapsRoll(dontValue);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Invalid DON'T value");
        }
    }

    private Roll createDoCrapsRoll() {
        String doValueText = doField.getText();
        try {
            int doValue = Integer.parseInt(doValueText);
            if (doValue < 2 || doValue == 7 || doValue == 11 || doValue > 12) {
                throw new IllegalStateException("Invalid DO value");
            }
            return new DoCrapsRoll(doValue);
        } catch (NumberFormatException nfe) {
            throw new IllegalStateException("Invalid DO value");
        }
    }

}