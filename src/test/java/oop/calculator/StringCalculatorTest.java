package oop.calculator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void itShouldReturnZeroForEmptyString() {
        assertEquals(StringCalculator.add(""), 0);
    }

    @Test
    public void itShouldReturnInputValueForASingleNumber() {
        assertEquals(StringCalculator.add("13"), 13);
    }

    @Test
    public void itShouldReturnSumOfWithCommaSeparatedInputValues() {
        assertEquals(StringCalculator.add("1,2"),3);
    }

    @Test
    public void itShouldReturnSumOfWithNewLineSeparatedInputValues() {
        assertEquals(StringCalculator.add("1\n2"),3);
    }

    @Test
    public void itShouldSumOfWithMultiDelimitedValues() {
        assertEquals(StringCalculator.add("1\n2,3\n4"),10);
    }
}
