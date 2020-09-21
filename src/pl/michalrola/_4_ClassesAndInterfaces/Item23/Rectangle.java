package pl.michalrola._4_ClassesAndInterfaces.Item23;

public class Rectangle extends Figure {

    final double length;
    final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
