package oop;

import static oop.MeasureUnitType.FOOT;
import static oop.MeasureUnitType.METER;

public class Foot extends MeasureUnit {

    public Foot(double measure) {
        super(measure, FOOT);
        targetMeasureRatios.put(METER, 0.3048);
    }

}
