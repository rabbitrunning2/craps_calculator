package com.ryan.crapscalculator.rolls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ryan.crapscalculator.rolls.DontPassRoll;
import com.ryan.crapscalculator.rolls.Roll;

public class DontPassRollTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTwoRoll() {
        new DontPassRoll(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThreeRoll() {
        new DontPassRoll(3);
    }

    @Test
    public void testFourAndTenRoll() {
        Roll roll = new DontPassRoll(4);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);

        roll = new DontPassRoll(10);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);
    }

    @Test
    public void testFiveAndNineRoll() {
        Roll roll = new DontPassRoll(5);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);

        roll = new DontPassRoll(9);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);
    }

    @Test
    public void testSixAndEightRoll() {
        Roll roll = new DontPassRoll(6);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);

        roll = new DontPassRoll(8);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);
    }

    @Test
    public void testSevenAndElevenRoll() {
        Roll roll = new DontPassRoll(7);
        assertEquals(1, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);

        roll = new DontPassRoll(11);
        assertEquals(1, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRoll() {
        new DontPassRoll(12);
    }
}
