package oop;

public class Die {

    private final int numberOfSides;
    private final static int SURE_EVENT_PROBABILITY = 1;

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double calculateProbabilityOfGettingASide() {
        return (double) 1 / numberOfSides;
    }

    public double calculateProbabilityOfNotGettingASide() {
        return SURE_EVENT_PROBABILITY - calculateProbabilityOfGettingASide();
    }
}
