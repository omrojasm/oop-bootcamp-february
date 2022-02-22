package oop;

public class FeetMeasureUnit {
    private static final double FEET_TO_METERS_RATIO = 0.3048;
    private final double measure;

    public FeetMeasureUnit(double measure) {
        this.measure = measure;
    }

    public double toValueInMeters() {
        return measure * FEET_TO_METERS_RATIO;
    }
}
