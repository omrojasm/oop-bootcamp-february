package oop;

import static oop.MeasureUnitType.CENTIMETER;

public class MeterMeasureUnit extends MeasureUnit {


    public MeterMeasureUnit(double measure) {
        super(measure, MeasureUnitType.METER);
        targetMeasureRatios.put(CENTIMETER, 100d);
    }

}
