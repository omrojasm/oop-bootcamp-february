package oop;

import static oop.MeasureUnitType.FOOT;
import static oop.MeasureUnitType.METER;

public class FeetMeasureUnit extends MeasureUnit {

    public FeetMeasureUnit(double measure) {
        super(measure, FOOT);
        targetMeasureRatios.put(METER, 0.3048);
    }

}
