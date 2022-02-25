package oop.calculator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    public void itShouldReturnZeroForEmptyString() {
        assertEquals(calculator.calculateSum(""), 0);
    }

    @Test
    public void itShouldReturnInputValueForASingleNumber() {
        assertEquals(calculator.calculateSum("13"), 13);
    }
}
