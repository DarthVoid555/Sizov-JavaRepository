package geometry2d;

import exceptions.NegativeRadiusException;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Радиус не может быть отрицательным: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Круг [радиус=%.2f, площадь=%.2f, периметр=%.2f]",
                radius, area(), perimeter());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Радиус не может быть отрицательным: " + radius);
        }
        this.radius = radius;
    }
}