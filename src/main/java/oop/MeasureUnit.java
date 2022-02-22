package oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class MeasureUnit {
    protected final double measure;
    protected final MeasureUnitType type;
    protected Map<MeasureUnitType, Double> targetMeasureRatios;

    public MeasureUnit(double measure, MeasureUnitType type) {
        this.measure = measure;
        this.type = type;
        this.targetMeasureRatios = new HashMap<>();
    }

    public boolean isEquivalentTo(MeasureUnit targetMeasure) {
        var ratio = getConversionRatioTo(targetMeasure.type);
        return Math.abs(this.measure * ratio - targetMeasure.measure) < 0.0001;
    }

    protected double getConversionRatioTo(MeasureUnitType targetType) {
        return Optional.ofNullable(targetMeasureRatios.get(targetType)).orElseThrow(() -> new UnknownConversionException(this.type, targetType));
    }

    protected double convertFrom(MeasureUnit otherUnit) {
        return otherUnit.type == type ?
            otherUnit.getMeasure() : otherUnit.getMeasure() * otherUnit.getConversionRatioTo(type);
    }

    public double getMeasure() {
        return measure;
    }
}
