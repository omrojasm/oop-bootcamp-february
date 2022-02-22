package oop;

import static java.lang.String.format;

public class UnknownConversionException extends RuntimeException {
    public UnknownConversionException(MeasureUnitType type, MeasureUnitType targetType) {
        super(format("Cannot convert from %s to %s", type, targetType));
    }
}
