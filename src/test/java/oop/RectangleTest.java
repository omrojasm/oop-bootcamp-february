package oop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RectangleTest {

  private Rectangle rectangle;

  @BeforeMethod
  public void setUp() {
    rectangle = new Rectangle(3, 4);
  }

  @Test
  public void itShouldReturnPerimeterRectanguleWhenGivenHeightAndWidth() {

    assertEquals(rectangle.calculatePerimeter(), 14);
  }

  @Test
  public void itShouldReturnTheAreaOfARectangleGivenTheHeightAndWidth() {
    assertEquals(rectangle.calculateArea(), 12);
  }

}
