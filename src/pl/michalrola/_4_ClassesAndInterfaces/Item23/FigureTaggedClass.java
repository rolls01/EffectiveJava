package pl.michalrola._4_ClassesAndInterfaces.Item23;

// Tagged class - vastly inferior to a class hierarchy!
public class FigureTaggedClass {
    enum Shape {RECTANGLE, CIRCLE;}

    final Shape shape;

    double length;
    double width;
    double radius;

    public FigureTaggedClass(double radius) {
        this.shape = Shape.CIRCLE;
        this.radius = radius;
    }

    public FigureTaggedClass(Shape shape, double length, double width) {
        this.shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}


