package oop;

import static oop.MeasureUnitType.INCH;

public class Inch extends MeasureUnit {

    public Inch(double measure) {
        super(measure, INCH);
    }

    public Inch add(MeasureUnit unitToAdd) {
        return new Inch(measure + convertFrom(unitToAdd));
    }


}
