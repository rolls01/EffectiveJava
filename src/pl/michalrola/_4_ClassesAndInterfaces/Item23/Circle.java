package pl.michalrola._4_ClassesAndInterfaces.Item23;

public class Circle extends Figure {

    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}
