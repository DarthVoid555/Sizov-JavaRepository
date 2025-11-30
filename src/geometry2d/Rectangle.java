package geometry2d;

import exceptions.NegativeSideException;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) throws NegativeSideException {
        if (width < 0) {
            throw new NegativeSideException("Ширина не может быть отрицательной: " + width);
        }
        if (height < 0) {
            throw new NegativeSideException("Высота не может быть отрицательной: " + height);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник [ширина=%.2f, высота=%.2f, площадь=%.2f, периметр=%.2f]",
                width, height, area(), perimeter());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) throws NegativeSideException {
        if (width < 0) {
            throw new NegativeSideException("Ширина не может быть отрицательной: " + width);
        }
        this.width = width;
    }

    public void setHeight(double height) throws NegativeSideException {
        if (height < 0) {
            throw new NegativeSideException("Высота не может быть отрицательной: " + height);
        }
        this.height = height;
    }
}