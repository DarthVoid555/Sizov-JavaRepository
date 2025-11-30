package geometry3d;

import geometry2d.Figure;
import exceptions.NegativeHeightException;
import exceptions.NullBaseException;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) throws NullBaseException, NegativeHeightException {
        if (base == null) {
            throw new NullBaseException("Основание цилиндра не может быть null");
        }
        if (height < 0) {
            throw new NegativeHeightException("Высота цилиндра не может быть отрицательной: " + height);
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    public double surfaceArea() {
        return 2 * base.area() + base.perimeter() * height;
    }

    @Override
    public String toString() {
        return String.format("Цилиндр [основание=%s, высота=%.2f, объем=%.2f, площадь поверхности=%.2f]",
                base.toString(), height, volume(), surfaceArea());
    }

    public Figure getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(Figure base) throws NullBaseException {
        if (base == null) {
            throw new NullBaseException("Основание цилиндра не может быть null");
        }
        this.base = base;
    }

    public void setHeight(double height) throws NegativeHeightException {
        if (height < 0) {
            throw new NegativeHeightException("Высота цилиндра не может быть отрицательной: " + height);
        }
        this.height = height;
    }
}