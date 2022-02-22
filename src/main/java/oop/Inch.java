package oop;

import static oop.MeasureUnitType.INCH;

public class Inch extends MeasureUnit {

    public Inch(double measure) {
        super(measure, INCH);
    }

    public Inch add(Inch inchesToAdd) {
        return new Inch(this.measure + inchesToAdd.getMeasure());
    }
}
