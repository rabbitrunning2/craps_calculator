package com.ryan.crapscalculator.rolls;

public class DontPassRoll extends Roll {

    public DontPassRoll(int dieValue) {
        super(dieValue);
    }

    @Override
    protected void calculateWinAndLoseNumbers() {
        switch (getDieValue()) {
        case 4:
        case 10:
            loseNumber++;
            loseNumber += DONT_FOUR_OR_TEN_P_LOSE_ODDS;
            break;
        case 5:
        case 9:
            loseNumber++;
            loseNumber += DONT_FIVE_OR_NINE_P_LOSE_ODDS;
            break;
        case 6:
        case 8:
            loseNumber++;
            loseNumber += DONT_SIX_OR_EIGHT_P_LOSE_ODDS;
            break;
        case 7:
        case 11:
            loseNumber++;
            break;
        default:
            throw new IllegalArgumentException("dieValue must be 4, 5, 6, 7, 8, 9, 10, or 11");
        }
    }

}
