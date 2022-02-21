package oop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DieTest {

    private Die die;

    @BeforeMethod
    public void setUp() {
        die = new Die(6);
    }

    @Test
    public void itShouldCalculateTheChanceOfGettingA6InADie() {
        assertEquals(die.calculateProbabilityOfGettingASide(), (double) 1 / 6, 0.001);
    }

    @Test
    public void itShouldCalculateTheChanceOfNotGettingA6InADie() {
        assertEquals(die.calculateProbabilityOfNotGettingASide(), (double) 5 / 6, 0.001);
    }
}
