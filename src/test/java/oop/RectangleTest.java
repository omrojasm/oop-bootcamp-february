package oop;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class RectangleTest {
    @Test
    public void itShouldReturnPerimeterRectanguleWhenGivenHeightAndWidth() {
        var rectangle = new Rectangle(3, 4);
        var calculatePerimeter = rectangle.calculatePerimeter();
        assertEquals(calculatePerimeter, 14);
    }

}
