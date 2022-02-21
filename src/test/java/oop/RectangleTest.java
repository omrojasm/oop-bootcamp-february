package oop;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class RectangleTest {

    @Test
    public void itShouldCreateARectangle() {
        var width = 2;
        var length = 4;
        var rectangle = new Rectangle(width, length);
        assertEquals(rectangle.getWidth(), width);
        assertEquals(rectangle.getLength(), length);
    }

    @Test
    public void itShouldCalculateArea() {
        var rectangle = new Rectangle(2,4);
        assertEquals(rectangle.calculateArea(), 8);
    }

    @Test
    public void itShouldCalculatePerimeter() {
        var rectangle = new Rectangle(2, 4);
        assertEquals(rectangle.calculatePerimeter(), 12);
    }

}
