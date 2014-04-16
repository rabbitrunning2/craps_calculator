package com.ryan.crapscalculator.rolls;


public class DontCrapsRoll extends Roll {

    public DontCrapsRoll(int dieValue) {
        super(dieValue);
    }

    @Override
    protected void calculateWinAndLoseNumbers() {
        switch (getDieValue()) {
        case 2:
        case 3:
            winNumber++;
            break;
        case 4:
        case 10:
            winNumber++;
            winNumber += DONT_FOUR_OR_TEN_C_WIN_ODDS;
            break;
        case 5:
        case 9:
            winNumber++;
            winNumber += DONT_FIVE_OR_NINE_C_WIN_ODDS;
            break;
        case 6:
        case 8:
            winNumber++;
            winNumber += DONT_SIX_OR_EIGHT_C_WIN_ODDS;
            break;
        default:
            throw new IllegalArgumentException("dieValue must be 2, 3, 4, 5, 6, 8, 9, or 10");
        }
    }

}
