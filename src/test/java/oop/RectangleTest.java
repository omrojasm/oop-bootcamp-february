package oop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RectangleTest {

  @Test
  public void itShouldReturnTheAreaWhenGivenAHeightAndWidth() {
    var rectangle = new Rectangle(3, 4);
    var sut = rectangle.calculateArea();
    assertEquals(sut, 5);
  }
}
