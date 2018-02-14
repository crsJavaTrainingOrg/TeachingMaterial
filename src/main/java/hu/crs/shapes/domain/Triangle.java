package hu.crs.shapes.domain;

import lombok.Value;

@Value
public class Triangle implements Shape {
    private final double a, b, c;


    public Triangle(double a, double b, double c) {
        if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalShapeParametersException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
