package oop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DieTest {

  @Test
  public void itShouldCalculateTheChanceOfGettingA6InADie() {
    Die die = new Die();
    assertEquals(die.calculateProbabilityOfGettingASideOnADiceOf(6), (double) 1/6, 0.001);
  }

  @Test
  public void itShouldCalculateTheChanceOfGettingA6InADieOf10Sides() {
    Die die = new Die();
    assertEquals(die.calculateProbabilityOfGettingASideOnADiceOf(10), (double) 1/10, 0.001);
  }

@Test
public void itShouldCalculateTheChanceOfNotGettingA6InADie() {
    Die die = new Die();
    assertEquals(die.calculateProbabilityOfNotGettingASideOnADiceOf(6), (double) 5/6);
}
}
