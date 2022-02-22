package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

public class MeasureUnitComparisonTest {

    @Test
    public void itShouldCompareFeetAndMeters() {
        var feet = new FeetMeasureUnit(1d);
        var meters = new MeterMeasureUnit(0.3048);

        assertTrue(feet.isEquivalentTo(meters));
    }

    @Test
    public void itShouldCompareMetersAndCentimeters() {
        var meters = new MeterMeasureUnit(2d);
        var centimeters = new CentimeterMeasureUnit(200d);
        assertTrue(meters.isEquivalentTo(centimeters));
    }

    @Test
    public void itShouldThrowAnExceptionWhenUnableToRetrieveRatio() {
        var meters = new MeterMeasureUnit(3d);
        var feet = new FeetMeasureUnit(3d);
        assertThrows(UnknownConversionException.class, () -> meters.isEquivalentTo(feet));
    }

}
