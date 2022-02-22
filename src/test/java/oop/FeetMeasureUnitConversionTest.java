package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FeetMeasureUnitConversionTest {

    @Test
    public void itShouldConvertFeetToMeters() {
        var feetMeasureUnit = new FeetMeasureUnit(1d);

        assertEquals(feetMeasureUnit.toValueInMeters(), 0.3048, 0.0001);
    }
}
