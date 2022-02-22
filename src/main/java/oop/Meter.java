package oop;

import static oop.MeasureUnitType.CENTIMETER;
import static oop.MeasureUnitType.INCH;

public class Meter extends MeasureUnit {


    public Meter(double measure) {
        super(measure, MeasureUnitType.METER);
        targetMeasureRatios.put(CENTIMETER, 100d);
        targetMeasureRatios.put(INCH, 39.3701);
    }

}
