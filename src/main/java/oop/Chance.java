package oop;

public class Chance {

    private final int options;
    private double probability;
    private final static int SURE_EVENT_PROBABILITY = 1;

    public Chance(int options) {
        this.options = options;
        calculateProbability();
    }

    public double getProbability() {
        return probability;
    }

    public double calculateNotProbability() {
        return SURE_EVENT_PROBABILITY - getProbability();
    }

    public double calculateIndependentChances(Chance chance) {
        return probability * chance.getProbability();
    }


    private void calculateProbability() {
        this.probability = (double) 1 / options;
    }

    public double calculateOrOfChances(Chance chance) {
        return (getProbability() + chance.getProbability()) - calculateIndependentChances(chance);
    }
}
