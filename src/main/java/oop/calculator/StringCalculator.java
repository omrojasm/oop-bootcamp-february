package oop.calculator;

public class StringCalculator {

    private int sum = 0;

    public int calculateSum(String input) {
        if(!input.isBlank()) {
            var operands = input.split(",");
            return Integer.parseInt(operands[0]) + Integer.parseInt(operands[1]);
        }
       return 0 ;
    }
}
