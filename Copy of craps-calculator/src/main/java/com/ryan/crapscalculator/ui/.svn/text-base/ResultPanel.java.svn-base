package com.ryan.crapscalculator.ui;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ResultPanel extends JPanel {

    private static final String DEFAULT_CONTROL = "1.5";
    private static final String DEFAULT_DEBIT = "5.00";

    private JButton calculateButton;
    private JButton resetButton;
    private JLabel controlLabel;
    private JLabel debitLabel;
    private JLabel newWagerLabel;
    private JTextField controlTextField;
    private JTextField debitTextField;
    private JTextField newWagerTextField;
    private JPanel controlFieldPanel;
    private JPanel debitFieldPanel;
    private JPanel newWagerFieldPanel;
    private JPanel buttonPanel;

    public ResultPanel() {
        super();
        buildPanel();
    }

    private void buildPanel() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(buildControlFieldRow());
        add(buildDebitFieldRow());
        add(buildNewWagerFieldRow());
        add(buildButtonRow());
    }

    private JPanel buildControlFieldRow() {
        controlFieldPanel = new JPanel();
        controlFieldPanel.setLayout(new GridLayout(0, 2));

        controlLabel = new JLabel("Control:");
        controlTextField = new JTextField(DEFAULT_CONTROL);

        controlFieldPanel.add(controlLabel);
        controlFieldPanel.add(controlTextField);

        return controlFieldPanel;
    }

    private JPanel buildDebitFieldRow() {
        debitFieldPanel = new JPanel();
        debitFieldPanel.setLayout(new GridLayout(0, 2));

        debitLabel = new JLabel("Debit:");
        debitTextField = new JTextField(DEFAULT_DEBIT);

        debitFieldPanel.add(debitLabel);
        debitFieldPanel.add(debitTextField);

        return debitFieldPanel;
    }

    private JPanel buildNewWagerFieldRow() {
        newWagerFieldPanel = new JPanel();
        newWagerFieldPanel.setLayout(new GridLayout(0, 2));

        newWagerLabel = new JLabel("New Wager:");
        newWagerTextField = new JTextField();
        newWagerTextField.setEditable(false);

        newWagerFieldPanel.add(newWagerLabel);
        newWagerFieldPanel.add(newWagerTextField);

        return newWagerFieldPanel;
    }

    private JPanel buildButtonRow() {

        buttonPanel = new JPanel(new GridLayout());

        calculateButton = new JButton("Calculate");
        resetButton = new JButton("Reset");

        buttonPanel.add(calculateButton);
        buttonPanel.add(resetButton);

        return buttonPanel;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public double getNewWagerTextFieldValue() {
        String newWagerText = newWagerTextField.getText();

        return Double.parseDouble(newWagerText);
    }

    public double getControlTextFieldValue() {
        String controlText = controlTextField.getText();

        return Double.parseDouble(controlText);
    }

    public double getDebitTextFieldValue() {
        String debitText = debitTextField.getText();

        return Double.parseDouble(debitText);
    }

    public void setNewWagerTextFieldValue(double newWagerValue) {
        newWagerTextField.setText(Double.toString(newWagerValue));
    }

    public void setControlTextFieldValue(double controlValue) {
        controlTextField.setText(Double.toString(controlValue));
    }

    public void setDebitTextFieldValue(double debitValue) {
        debitTextField.setText(Double.toString(debitValue));
    }

    public void clear() {
        newWagerTextField.setEnabled(false);
        newWagerTextField.setText("");
        controlTextField.setText(DEFAULT_CONTROL);
        debitTextField.setText(DEFAULT_DEBIT);
    }
}
