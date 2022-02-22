package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MeasureUnitOperationTest {

    public static final double ERROR_MARGIN = 0.0001;

    @Test
    public void itShouldAddInchesToInches() {
        var inches = new Inch(2d);
        var inchesToAdd = new Inch(2d);

        assertEquals(inches.add(inchesToAdd).getMeasure(), 4, ERROR_MARGIN);
    }

    @Test
    public void itShouldAddMetersToInches() {
        var inches = new Inch(2d);
        var meters = new Meter(1d);

        assertEquals(inches.add(meters).getMeasure(), 41.37008, ERROR_MARGIN);
    }

}
