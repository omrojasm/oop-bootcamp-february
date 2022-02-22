package oop;

public class ChanceEvent {
    private final int numberOfPossibleOutcomes;
    private static final double SURE_EVENT_PROBABILITY = 1.0;

    public ChanceEvent(int numberOfPossibleOutcomes) {
        this.numberOfPossibleOutcomes = numberOfPossibleOutcomes;
    }

    public double calculateProbabilityOfEvent() {
        return SURE_EVENT_PROBABILITY / (double) numberOfPossibleOutcomes;
    }

    public double calculateProbabilityOfEventNotHappening() {
        return SURE_EVENT_PROBABILITY - calculateProbabilityOfEvent();
    }

}
