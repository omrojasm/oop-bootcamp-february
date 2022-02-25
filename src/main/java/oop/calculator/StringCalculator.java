package oop.calculator;

import java.util.Arrays;

public class StringCalculator {

    public static final String ALLOWED_DELIMITERS = ",|\\n";

    public static int add(String input) {
        if (!input.isBlank()) {
            var operands = input.split(ALLOWED_DELIMITERS);
            return Arrays.stream(operands).mapToInt(Integer::parseInt).reduce(0, Math::addExact);
        }
        return 0;
    }
}
