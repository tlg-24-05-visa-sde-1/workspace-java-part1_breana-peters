package edu.geometry;

public class Rectangle implements Shape {  // made the class public, Rectangle Is-A shape decleared two instance variable length and width
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getPerimeter(){
        return 2* (width + length);
    }
}