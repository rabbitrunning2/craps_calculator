package com.ryan.crapscalculator.rolls;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoPassRollTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTwoRoll() {
        new DoPassRoll(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThreeRoll() {
        new DoPassRoll(3);
    }

    @Test
    public void testFourAndTenRoll() {
        Roll roll = new DoPassRoll(4);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(3, roll.getWinNumber(), 0);

        roll = new DoPassRoll(10);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(3, roll.getWinNumber(), 0);
    }

    @Test
    public void testFiveAndNineRoll() {
        Roll roll = new DoPassRoll(5);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(2.5, roll.getWinNumber(), 0);

        roll = new DoPassRoll(9);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(2.5, roll.getWinNumber(), 0);
    }

    @Test
    public void testSixAndEightRoll() {
        Roll roll = new DoPassRoll(6);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(2.2, roll.getWinNumber(), 0);

        roll = new DoPassRoll(8);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(2.2, roll.getWinNumber(), 0);
    }

    @Test
    public void testSevenAndElevenRoll() {
        Roll roll = new DoPassRoll(7);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(1, roll.getWinNumber(), 0);

        roll = new DoPassRoll(11);
        assertEquals(0, roll.getLoseNumber(), 0);
        assertEquals(1, roll.getWinNumber(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwelveRoll() {
        new DoPassRoll(12);
    }

}
