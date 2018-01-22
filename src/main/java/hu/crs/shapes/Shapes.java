package hu.crs.shapes;

import hu.crs.shapes.domain.AngleCount;
import hu.crs.shapes.domain.Circle;
import hu.crs.shapes.domain.IllegalShapeParametersException;
import hu.crs.shapes.domain.Rectangle;
import hu.crs.shapes.domain.Shape;
import hu.crs.shapes.domain.Triangle;

public class Shapes {
    public Shape shapeFactory(AngleCount angleCount) throws IllegalShapeParametersException {
        switch (angleCount) {
            case ZERO:
                return new Circle(0.0);
            case THREE:
                return new Triangle(1, 2, 30);
            case FOUR:
                return new Rectangle(1, 2 );
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        try {
            Shape shape = shapes.shapeFactory(AngleCount.THREE);
            Triangle triangle = (Triangle) shape;
            System.out.println(shape.area());
            System.out.println(triangle.getA());
            System.out.println(triangle.getB());
            System.out.println(triangle.getC());
        } catch (IllegalShapeParametersException e) {
            e.printStackTrace();
        }
    }
}
