package edu.geometry;

public class Circle implements Shape { // Declared a class named Circle and made it public because we want others to see . Implements shape because it IS-A Shape).
    private double radius; // Made an instance variable set it to private made it a double type and named it radius. Its going to store the radius of our circle.

    public Circle(double radius) {  // Made a constructor takes a double parameter radius and initializes the instance variable radius with the value passed to the constructor.
        this.radius = radius;
    }


    // Method calculates and returns the area of the circle
    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    // method returns the value of the radius instance variable
    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2* Math.PI * radius;
    }
}

