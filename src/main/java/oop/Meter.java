package oop;

import static oop.MeasureUnitType.CENTIMETER;

public class Meter extends MeasureUnit {


    public Meter(double measure) {
        super(measure, MeasureUnitType.METER);
        targetMeasureRatios.put(CENTIMETER, 100d);
    }

}
