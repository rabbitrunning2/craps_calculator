package com.ryan.crapscalculator.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.ryan.crapscalculator.rolls.DoCrapsRoll;
import com.ryan.crapscalculator.rolls.DoPassRoll;
import com.ryan.crapscalculator.rolls.DontCrapsRoll;
import com.ryan.crapscalculator.rolls.DontPassRoll;
import com.ryan.crapscalculator.rolls.Roll;

public class CrapsCalculatorModelTest {

    private static final double DELTA = .009;

    @Test
    public void testCalculateNewWagerWithOneRoll() {
        List<Roll> rolls = new ArrayList<Roll>();
        rolls.add(new DontPassRoll(5));

        CrapsCalculatorModel model = new CrapsCalculatorModel(rolls);
        double control = 1.5;
        double debit = 5;
        assertEquals(2.39, model.calculateNewWager(control, debit), DELTA);
    }

    @Test
    public void testCalculateNewWagerWithFiveRolls() {
        List<Roll> rolls = new ArrayList<Roll>();
        rolls.add(new DontCrapsRoll(4));
        rolls.add(new DontCrapsRoll(2));
        rolls.add(new DoPassRoll(7));
        rolls.add(new DontPassRoll(8));
        rolls.add(new DontPassRoll(11));

        double control = 1.5;
        double debit = 6;
        CrapsCalculatorModel model = new CrapsCalculatorModel(rolls);
        assertEquals(10.02, model.calculateNewWager(control, debit), DELTA);
    }

    @Test
    public void testCalculateNewWagerWithTenRolls() {
        List<Roll> rolls = new ArrayList<Roll>();
        rolls.add(new DoPassRoll(4));
        rolls.add(new DontCrapsRoll(5));
        rolls.add(new DoPassRoll(7));
        rolls.add(new DontPassRoll(11));
        rolls.add(new DoCrapsRoll(12));
        rolls.add(new DontPassRoll(6));
        rolls.add(new DoCrapsRoll(8));
        rolls.add(new DontPassRoll(9));
        rolls.add(new DontPassRoll(7));
        rolls.add(new DoPassRoll(7));

        double control = 2.67;
        double debit = 50;
        CrapsCalculatorModel model = new CrapsCalculatorModel(rolls);
        assertEquals(16.7, model.calculateNewWager(control, debit), DELTA);
    }

    @Test
    public void testCalculateNewWagerWithFiftyRolls() {
        List<Roll> rolls = new ArrayList<Roll>();
        rolls.add(new DoPassRoll(6));
        rolls.add(new DoPassRoll(7));
        rolls.add(new DontCrapsRoll(8));
        rolls.add(new DoCrapsRoll(2));
        rolls.add(new DontPassRoll(11));

        rolls.add(new DoPassRoll(11));
        rolls.add(new DoCrapsRoll(10));
        rolls.add(new DontPassRoll(8));
        rolls.add(new DontPassRoll(5));
        rolls.add(new DontPassRoll(6));

        rolls.add(new DoCrapsRoll(4));
        rolls.add(new DontCrapsRoll(4));
        rolls.add(new DoPassRoll(7));
        rolls.add(new DontPassRoll(11));
        rolls.add(new DoCrapsRoll(12));

        rolls.add(new DoCrapsRoll(2));
        rolls.add(new DontCrapsRoll(3));
        rolls.add(new DoCrapsRoll(2));
        rolls.add(new DoPassRoll(7));
        rolls.add(new DontPassRoll(4));

        rolls.add(new DoPassRoll(6));
        rolls.add(new DoCrapsRoll(8));
        rolls.add(new DontPassRoll(7));
        rolls.add(new DontPassRoll(7));
        rolls.add(new DontPassRoll(11));

        rolls.add(new DoCrapsRoll(12));
        rolls.add(new DontPassRoll(4));
        rolls.add(new DoPassRoll(4));
        rolls.add(new DontCrapsRoll(6));
        rolls.add(new DontCrapsRoll(8));

        rolls.add(new DontPassRoll(4));
        rolls.add(new DoPassRoll(6));
        rolls.add(new DoCrapsRoll(8));
        rolls.add(new DoCrapsRoll(12));
        rolls.add(new DontPassRoll(7));

        rolls.add(new DontPassRoll(4));
        rolls.add(new DoPassRoll(4));
        rolls.add(new DontPassRoll(6));
        rolls.add(new DoCrapsRoll(8));
        rolls.add(new DoPassRoll(11));

        rolls.add(new DoPassRoll(7));
        rolls.add(new DontCrapsRoll(6));
        rolls.add(new DontPassRoll(4));
        rolls.add(new DoCrapsRoll(3));
        rolls.add(new DontCrapsRoll(3));

        rolls.add(new DoPassRoll(10));
        rolls.add(new DontPassRoll(8));
        rolls.add(new DoCrapsRoll(9));
        rolls.add(new DoPassRoll(10));
        rolls.add(new DoPassRoll(7));

        double control = 1.5;
        double debit = 10;
        CrapsCalculatorModel model = new CrapsCalculatorModel(rolls);
        assertEquals(1.66, model.calculateNewWager(control, debit), DELTA);
    }
}
