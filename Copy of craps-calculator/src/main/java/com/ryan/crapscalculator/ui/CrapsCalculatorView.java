package com.ryan.crapscalculator.ui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class CrapsCalculatorView {

    private final JFrame mainFrame;
    private final DecisionRowsPanel decisionRowsPanel;
    private final ResultPanel resultPanel;

    public CrapsCalculatorView() {
        mainFrame = new JFrame("Craps Calculator");
        decisionRowsPanel = new DecisionRowsPanel();
        resultPanel = new ResultPanel();
        createAndShowMainWindow();
    }

    private void createAndShowMainWindow() {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.getContentPane().setLayout(new FlowLayout());
        mainFrame.getContentPane().add(decisionRowsPanel);
        mainFrame.getContentPane().add(resultPanel);
        mainFrame.setLocation(400, 0);
        mainFrame.setBackground(Color.decode("#2B8844"));
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public void setVisible(boolean visible) {
        mainFrame.setVisible(visible);
    }

    public ResultPanel getResultPane() {
        return resultPanel;
    }

    public DecisionRowsPanel getDecisionRowsPanel() {
        return decisionRowsPanel;
    }

    public JFrame getMainWindow() {
        return mainFrame;
    }

}
