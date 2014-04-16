package com.ryan.crapscalculator.rolls;

public class DoCrapsRoll extends Roll {

    public DoCrapsRoll(int dieValue) {
        super(dieValue);
    }

    @Override
    protected void calculateWinAndLoseNumbers() {
        switch (getDieValue()) {
        case 2:
        case 3:
            loseNumber++;
            break;
        case 4:
        case 10:
            loseNumber++;
            loseNumber += DO_FOUR_OR_TEN_C_LOSE_ODDS;
            break;
        case 5:
        case 9:
            loseNumber++;
            loseNumber += DO_FIVE_OR_NINE_C_LOSE_ODDS;
            break;
        case 6:
        case 8:
            loseNumber++;
            loseNumber += DO_SIX_OR_EIGHT_C_LOSE_ODDS;
            break;
        case 12:
            loseNumber++;
            break;
        default:
            throw new IllegalArgumentException("dieValue must be 2, 3, 4, 5, 6, 8, 9, or 10");
        }
    }

}
