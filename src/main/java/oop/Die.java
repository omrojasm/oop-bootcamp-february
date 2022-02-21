package oop;

public class Die {

  public double calculateProbabilityOfGettingASideOnADiceOf(int numberOfSides) {
    return (double) 1/numberOfSides;
  }

  public double calculateProbabilityOfNotGettingASideOnADiceOf(int numberOfSides) {
    return 1 - calculateProbabilityOfGettingASideOnADiceOf(numberOfSides);
  }
}
