package com.ryan.crapscalculator.rolls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoCrapsRollTest {

    @Test
    public void testTwoAndThreeRoll() {
        Roll roll = new DoCrapsRoll(2);
        assertEquals(0, roll.getWinNumber(), 0);
        assertEquals(1, roll.getLoseNumber(), 0);

        roll = new DoCrapsRoll(3);
        assertEquals(0, roll.getWinNumber(), 0);
        assertEquals(1, roll.getLoseNumber(), 0);
    }

    @Test
    public void testFourAndTenRoll() {
        Roll roll = new DoCrapsRoll(4);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);

        roll = new DoCrapsRoll(10);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);
    }

    @Test
    public void testFiveAndNineRoll() {
        Roll roll = new DoCrapsRoll(5);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);

        roll = new DoCrapsRoll(9);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);
    }

    @Test
    public void testSixAndEightRoll() {
        Roll roll = new DoCrapsRoll(6);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);

        roll = new DoCrapsRoll(8);
        assertEquals(2, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSevenRoll() {
        new DoCrapsRoll(7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testElevenRoll() {
        new DoCrapsRoll(11);
    }

    @Test
    public void testTwelveRoll() {
        Roll roll = new DoCrapsRoll(12);
        assertEquals(1, roll.getLoseNumber(), 0);
        assertEquals(0, roll.getWinNumber(), 0);
    }

}
