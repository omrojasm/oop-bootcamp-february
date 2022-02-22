package oop;

public class MeasureComparator {
    public static boolean compareEquivalence(double sourceMeasure, double targetMeasure, double ratio) {
        var sourceConverted = (sourceMeasure * ratio);
        return Math.abs(sourceConverted-targetMeasure) < 0.0001;
    }
}
