package oop;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChanceTest {

    private Chance chance;

    @BeforeMethod
    public void setUp() {
        chance = new Chance(6);
    }

    @Test
    public void itShouldCalculateTheChanceOfGettingA6InADie() {
        assertEquals(chance.getProbability(), (double) 1 / 6, 0.001);
    }

    @Test
    public void itShouldCalculateTheChanceOfNotGettingA6InADie() {
        assertEquals(chance.calculateNotProbability(), (double) 5 / 6, 0.001);
    }

    @Test
    public void itShouldCalculateTheProductOfTwoChances() {
        var die1 = new Chance(6);
        var die2 = new Chance(6);

        var result = die1.calculateIndependentChances(
            die2
        );

        AssertJUnit.assertEquals(result, (double) 1 / 36);
    }

    @Test
    public void itShouldCalculateLogicalOrOfTwoChances() {
        var die1 = new Chance(6);
        var die2 = new Chance(6);

        var result = die1.calculateOrOfChances(
            die2
        );

        AssertJUnit.assertEquals(result, 0.305, 0.001);
    }
}
