package oop;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChanceTest {

    private Dice dice;

    @BeforeTest
    public void setUp() {
        dice = new Dice();
    }

    @Test
    public void itShouldReturnOneSixthAsProbabilityOfRollingAnyNumber() {
        assertEquals(dice.calculateProbabilityOfEvent(), 1.0 / 6.0);
    }

    @Test
    public void itShouldReturnFiveSixthAsProbabilityOfNotRollingAnyNumber() {
        assertEquals(dice.calculateProbabilityOfNotEvent(), 5.0 / 6.0);
    }
}
