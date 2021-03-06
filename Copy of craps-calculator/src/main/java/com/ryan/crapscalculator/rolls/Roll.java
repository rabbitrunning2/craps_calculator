package com.ryan.crapscalculator.rolls;

public abstract class Roll {

    static final int DO_FOUR_OR_TEN_P_WIN_ODDS = 1;
    static final int DO_FOUR_OR_TEN_C_LOSE_ODDS = 1;
    static final double DO_FIVE_OR_NINE_P_WIN_ODDS = 1;
    static final int DO_FIVE_OR_NINE_C_LOSE_ODDS = 1;
    static final double DO_SIX_OR_EIGHT_P_WIN_ODDS = 1;
    static final int DO_SIX_OR_EIGHT_C_LOSE_ODDS = 1;

    static final double DONT_SIX_OR_EIGHT_C_WIN_ODDS = 1;
    static final int DONT_SIX_OR_EIGHT_P_LOSE_ODDS = 1;
    static final double DONT_FIVE_OR_NINE_C_WIN_ODDS = 1;
    static final int DONT_FIVE_OR_NINE_P_LOSE_ODDS = 1;
    static final double DONT_FOUR_OR_TEN_C_WIN_ODDS = 1;
    static final int DONT_FOUR_OR_TEN_P_LOSE_ODDS = 1;

    protected double loseNumber = 0;
    protected double winNumber = 0;

    private final int dieValue;

    public Roll(int dieValue) {
        this.dieValue = dieValue;
        calculateWinAndLoseNumbers();
    }

    protected abstract void calculateWinAndLoseNumbers();

    protected int getDieValue() {
        return dieValue;
    }

    public double getLoseNumber() {
        return loseNumber;
    }

    public double getWinNumber() {
        return winNumber;
    }
}
