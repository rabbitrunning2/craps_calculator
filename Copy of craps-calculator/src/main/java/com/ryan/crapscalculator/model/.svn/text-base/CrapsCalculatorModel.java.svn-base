package com.ryan.crapscalculator.model;

import java.util.List;

import com.ryan.crapscalculator.rolls.Roll;

public class CrapsCalculatorModel {

    private double winNumber = 0;
    private double loseNumber = 0;
    private double control = 0;

    private final List<Roll> rolls;

    public CrapsCalculatorModel(List<Roll> rolls) {
        this.rolls = rolls;
    }

    public double calculateNewWager(double control, double debit) {
        buildWinAndLoseNumbers();

        if (winNumber > loseNumber) {
            this.control = control - (winNumber - loseNumber);
        } else if (loseNumber > winNumber) {
            this.control = control + (loseNumber - winNumber);
        }
        return (debit / this.control) * 1.67;
    }

    private void buildWinAndLoseNumbers() {
        for (Roll roll : rolls) {
            winNumber += roll.getWinNumber();
            loseNumber += roll.getLoseNumber();
        }
    }

    public double getControl() {
        return control;
    }

}
