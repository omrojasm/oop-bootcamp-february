package oop;

import static oop.MeasureUnitType.INCH;

public class InchMeasureUnit extends MeasureUnit {

    public InchMeasureUnit(double measure) {
        super(measure, INCH);
    }

    public InchMeasureUnit add(InchMeasureUnit inchesToAdd) {
        return new InchMeasureUnit(this.measure + inchesToAdd.getMeasure());
    }
}
