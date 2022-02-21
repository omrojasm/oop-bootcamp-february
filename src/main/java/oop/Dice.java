package oop;

public class Dice {

    private static final int NUMBER_OF_POSSIBLE_EVENTS = 6;

    public double calculateProbabilityOfEvent() {
        return 1.0 / (double) NUMBER_OF_POSSIBLE_EVENTS;
    }

    public double calculateProbabilityOfNotEvent() {
        return 1.0 - 1.0 / (double) NUMBER_OF_POSSIBLE_EVENTS ;
    }
}
