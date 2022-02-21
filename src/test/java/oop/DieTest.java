package oop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DieTest {

  @Test
  public void itShouldCalculateTheChanceOfGettingA6InADie() {
    Die die = new Die();
    assertEquals(die.calculateProbabilityOf(6), (double) 1/6, 0.001);
  }

  @Test
  public void itShouldCalculateTheChanceOfGettingA5InADie() {
    Die die = new Die();
    assertEquals(die.calculateProbabilityOf(5), (double) 1/5, 0.001);
  }
}
