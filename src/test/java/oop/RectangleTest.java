package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class RectangleTest {

    @Test
    public void itShouldCalculateArea() {
        var rectangle = new Rectangle(2, 4);
        assertEquals(rectangle.calculateArea(), 8);
    }

    @Test
    public void itShouldCalculatePerimeter() {
        var rectangle = new Rectangle(2, 4);
        assertEquals(rectangle.calculatePerimeter(), 12);
    }

}
