package oop.calculator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    public void itShouldReturnZeroForEmptyString() {
        assertEquals(calculator.calculateSum(""), 0);
    }
}
