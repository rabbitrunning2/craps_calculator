package com.ryan.crapscalculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import com.ryan.crapscalculator.model.CrapsCalculatorModel;
import com.ryan.crapscalculator.rolls.Roll;
import com.ryan.crapscalculator.ui.CrapsCalculatorView;
import com.ryan.crapscalculator.ui.DecisionRow;
import com.ryan.crapscalculator.ui.DecisionRowsPanel;
import com.ryan.crapscalculator.ui.ResultPanel;

public class CrapsCalculatorController {

    private final CrapsCalculatorView mainView;
    private ResultPanel resultPanel;
    private DecisionRowsPanel decisionRowsPanel;

    public CrapsCalculatorController() {
        mainView = new CrapsCalculatorView();
        resultPanel = mainView.getResultPane();
        decisionRowsPanel = mainView.getDecisionRowsPanel();

        createListeners();

        mainView.setVisible(true);
    }

    private void createListeners() {
        resultPanel.getResetButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doReset();
            }
        });
        resultPanel.getCalculateButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doCalculate();
            }
        });
    }

    private void doReset() {
        decisionRowsPanel.clear();
        resultPanel.clear();
    }

    private void doCalculate() {
        decisionRowsPanel.resetRowColors();
        List<Roll> rolls = translateDecisionRowsToRolls(decisionRowsPanel.getDecisionRowList());
        if (rolls != null) {
            CrapsCalculatorModel model = new CrapsCalculatorModel(rolls);

            double newWager = model.calculateNewWager(resultPanel.getControlTextFieldValue(), resultPanel
                    .getDebitTextFieldValue());
            double roundedNewWager = Math.round(newWager * 100.0) / 100.0;
            resultPanel.setNewWagerTextFieldValue(roundedNewWager);

            double newControl = model.getControl();
            double roundedControl = Math.round(newControl * 100.0) / 100.0;
            resultPanel.setControlTextFieldValue(roundedControl);
        }
    }

    private List<Roll> translateDecisionRowsToRolls(List<DecisionRow> decisionRowList) {
        List<Roll> rolls = new ArrayList<Roll>();
        Map<Integer, String> errors = new HashMap<Integer, String>();
        for (DecisionRow row : decisionRowList) {
            try {
                rolls.add(row.getAsRoll());
            } catch (IllegalStateException ise) {
                row.showError();
                errors.put(decisionRowList.indexOf(row) + 1, ise.getMessage());
            }
        }
        if (errors.size() > 0) {
            JOptionPane.showMessageDialog(mainView.getMainWindow(), createErrorMessages(errors), "Errors",
                    JOptionPane.ERROR_MESSAGE, null);
            return null;
        }
        return rolls;
    }

    private String createErrorMessages(Map<Integer, String> errors) {
        StringBuffer sb = new StringBuffer();
        for (Integer i : errors.keySet()) {
            sb.append("Row " + i + ": " + errors.get(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
