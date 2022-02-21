package oop;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int calculatePerimeter() {
        int result = 2*(height + width);
        return result;
    }
}
