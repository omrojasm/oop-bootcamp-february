package oop;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ChanceTest {

    @Test
    public void itShouldCalculateTheProductOfTwoChances() {
        var die1 = new Die(6);
        var die2 = new Die(6);

        var result = new Chance().calculateIndependentChances(
            die1.calculateProbabilityOfGettingASide(),
            die2.calculateProbabilityOfGettingASide()
        );

        assertEquals(result, (double) 1 / 36);
    }
}
