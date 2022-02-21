package oop;

public class Rectangle {

    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() { return (length + width) * 2;}
}
