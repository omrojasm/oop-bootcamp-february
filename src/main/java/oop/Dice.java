package oop;

public class Dice {

    private static final int NUMBER_OF_POSSIBLE_EVENTS = 6;
    private static final double SURE_EVENT_PROBABILITY = 1.0;

    public double calculateProbabilityOfEvent() {
        return SURE_EVENT_PROBABILITY / (double) NUMBER_OF_POSSIBLE_EVENTS;
    }

    public double calculateProbabilityOfEventNotHappening() {
        return SURE_EVENT_PROBABILITY - calculateProbabilityOfEvent();
    }
}
