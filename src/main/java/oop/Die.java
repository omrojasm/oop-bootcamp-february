package oop;

public class Die {

    private final int numberOfSides;

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double calculateProbabilityOfGettingASide() {
        return (double) 1 / numberOfSides;
    }

    public double calculateProbabilityOfNotGettingASide() {
        return 1 - calculateProbabilityOfGettingASide();
    }
}
