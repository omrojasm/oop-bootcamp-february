package oop.calculator;

public class StringCalculator {

    public int calculateSum(String input) {
       return input.isBlank() ? 0 : Integer.parseInt(input);
    }
}
