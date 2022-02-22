package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MeasureComparatorTest {

    private static final double INCHES_TO_YARD_RATIO = 0.0278;

    @Test
    public void itShouldCompareInchesAndYards() {
        var inches = 5d;
        var yards = 0.1389;
        var areEquivalent = MeasureComparator.compareEquivalence(inches, yards, INCHES_TO_YARD_RATIO);
        assertTrue(areEquivalent);
    }
}
