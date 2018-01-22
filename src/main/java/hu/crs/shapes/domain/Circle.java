package hu.crs.shapes.domain;

import lombok.Value;

@Value
public class Circle implements Shape {
    private final double r;

    public Circle(double r) throws IllegalShapeParametersException{
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*Math.PI;
    }
}
