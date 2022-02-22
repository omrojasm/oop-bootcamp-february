package oop;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiceRollTest {

    private DiceRoll diceRoll;

    @BeforeTest
    public void setUp() {
        diceRoll = new DiceRoll();
    }

    @Test
    public void itShouldReturnOneSixthAsProbabilityOfRollingAnyNumber() {
        assertEquals(diceRoll.calculateProbabilityOfEvent(), 1.0 / 6.0);
    }

    @Test
    public void itShouldReturnFiveSixthAsProbabilityOfNotRollingAnyNumber() {
        assertEquals(diceRoll.calculateProbabilityOfEventNotHappening(), 5.0 / 6.0);
    }
}
