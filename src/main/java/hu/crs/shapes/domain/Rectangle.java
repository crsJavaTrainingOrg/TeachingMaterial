package hu.crs.shapes.domain;

import lombok.Value;

@Value
public class Rectangle implements Shape {
    double a,b;

    @Override
    public double area() {
        return a*b;
    }
}
