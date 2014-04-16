package com.ryan.crapscalculator.rolls;

public class DoPassRoll extends Roll {

    public DoPassRoll(int dieValue) {
        super(dieValue);
    }

    @Override
    protected void calculateWinAndLoseNumbers() {
        switch (getDieValue()) {
        case 4:
        case 10:
            winNumber++;
            winNumber += DO_FOUR_OR_TEN_P_WIN_ODDS;
            break;
        case 5:
        case 9:
            winNumber++;
            winNumber += DO_FIVE_OR_NINE_P_WIN_ODDS;
            break;
        case 6:
        case 8:
            winNumber++;
            winNumber += DO_SIX_OR_EIGHT_P_WIN_ODDS;
            break;
        case 7:
        case 11:
            winNumber++;
            break;
        default:
            throw new IllegalArgumentException("dieValue must be 4, 5, 6, 7, 8, 9, 10, or 11");
        }
    }

}
