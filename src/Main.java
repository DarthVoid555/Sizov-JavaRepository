import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(5.0);
            Rectangle rectangle = new Rectangle(3.0, 4.0);

            System.out.println("2D фигуры:");
            System.out.println(circle);
            System.out.println(rectangle);
            System.out.println();


            Cylinder cylinder1 = new Cylinder(circle, 10.0);
            Cylinder cylinder2 = new Cylinder(rectangle, 8.0);

            System.out.println("3D цилиндры:");
            System.out.println(cylinder1);
            System.out.println("Объем: " + cylinder1.volume());
            System.out.println(cylinder2);
            System.out.println("Объем: " + cylinder2.volume());
            System.out.println();


            System.out.println("Демонстрация обработки исключений:");

            try {
                Circle invalidCircle = new Circle(-5.0);
            } catch (NegativeRadiusException e) {
                System.out.println("Поймано исключение: " + e.getMessage());
            }

            try {
                Cylinder invalidCylinder = new Cylinder(null, 5.0);
            } catch (NullBaseException e) {
                System.out.println("Поймано исключение: " + e.getMessage());
            }

            try {
                Cylinder invalidCylinder = new Cylinder(circle, -2.0);
            } catch (NegativeHeightException e) {
                System.out.println("Поймано исключение: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Неожиданная ошибка: " + e.getMessage());
        }
    }
}