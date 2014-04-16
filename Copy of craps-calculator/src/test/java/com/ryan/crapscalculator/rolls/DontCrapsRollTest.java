package com.ryan.crapscalculator.rolls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ryan.crapscalculator.rolls.DontCrapsRoll;
import com.ryan.crapscalculator.rolls.Roll;

public class DontCrapsRollTest {

    @Test
    public void testTwoAndThreeRoll() {
        Roll roll = new DontCrapsRoll(2);
        assertEquals(1, roll.getWinNumber(), 0);
        assertEquals(0, roll.getLoseNumber(), 0);

        roll = new DontCrapsRoll(3);
        assertEquals(1, roll.getWinNumber(), 0);
        assertEquals(0, roll.getLoseNumber(), 0);
    }

    @Test
    public void testFourAndTenRoll() {
        Roll roll = new DontCrapsRoll(4);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(1.5, roll.getWinNumber(), 0);

        roll = new DontCrapsRoll(10);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(1.5, roll.getWinNumber(), 0);
    }

    @Test
    public void testFiveAndNineRoll() {
        Roll roll = new DontCrapsRoll(5);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(1.67, roll.getWinNumber(), 0);

        roll = new DontCrapsRoll(9);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(1.67, roll.getWinNumber(), 0);
    }

    @Test
    public void testSixAndEightRoll() {
        Roll roll = new DontCrapsRoll(6);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(1.83, roll.getWinNumber(), 0);

        roll = new DontCrapsRoll(8);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(1.83, roll.getWinNumber(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSevenRoll() {
        new DontCrapsRoll(7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testElevenRoll() {
        new DontCrapsRoll(11);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwelveRoll() {
        new DontCrapsRoll(12);
    }

}
